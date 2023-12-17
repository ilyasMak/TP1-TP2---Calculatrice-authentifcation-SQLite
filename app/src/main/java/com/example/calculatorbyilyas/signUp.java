package com.example.calculatorbyilyas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class signUp extends AppCompatActivity {
    Button AddUser ;
    TextInputEditText Login , Password , Nom , Prenom  ;
    ILyasDataBase db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        db = new ILyasDataBase(this,"Accounts",null , 1);
        AddUser =findViewById(R.id.AddUser);
        Login = findViewById(R.id.Login);
        Password = findViewById(R.id.PasswordSignUp);
        Nom = findViewById(R.id.Nom);
        Prenom =findViewById(R.id.Prenom);
        AddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  if(Nom.getText().toString().equals("") || Prenom.getText().toString().equals("") ||Login.getText().toString().equals("") || Password.getText().toString().equals("") ){
                      Toast.makeText(signUp.this, "Remplir toute les champs", Toast.LENGTH_SHORT).show();
                  }
                  else if(db.emailExists(Login.getText().toString()) || db.PasswordExists(Password.getText().toString()) ){
                      System.out.println(db.emailExists(Login.getText().toString()) );
                      System.out.println( db.PasswordExists(Password.getText().toString()) );
                      Toast.makeText(signUp.this, "Email ou mot de passe deja existe", Toast.LENGTH_SHORT).show();
                  }else {

                   db.InsererCompte(Password.getText().toString(),Login.getText().toString());
                   startActivity(new Intent(signUp.this,login.class));
                  }
            }
        });
    }
}