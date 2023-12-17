package com.example.calculatorbyilyas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {
    Button login ;
    TextInputEditText mail , password ;
    ILyasDataBase db ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new ILyasDataBase(this,"Accounts",null , 1);
      login = findViewById(R.id.connecter);
      mail =findViewById(R.id.Log) ;
      password = findViewById(R.id.PasswordToConnect);

      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
               if(login.getText().toString().equals("") || mail.getText().toString().equals("")){
                   Toast.makeText(login.this, "Remplir toute les champs", Toast.LENGTH_SHORT).show();
               }else if(db.emailExists( mail.getText().toString()) && db.PasswordExists(password.getText().toString()) ){

                   startActivity(new Intent(login.this , MainActivity.class));
               }else {

                   System.out.println(db.emailExists(login.getText().toString()) );
                   System.out.println(db.PasswordExists(password.getText().toString()));
                   Toast.makeText(login.this , "Ce compte n'existe pas !",Toast.LENGTH_LONG).show();
               }
          }
      });
    }

    public void createAccount(View v){
        startActivity(new Intent(login.this,signUp.class)  );
    }
}