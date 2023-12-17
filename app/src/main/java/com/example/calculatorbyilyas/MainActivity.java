package com.example.calculatorbyilyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    TextView TVcalcText,TVresultat;
    boolean egalCliked = false ;
    boolean bol = true ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVcalcText = findViewById(R.id.TVcalText);
        TVresultat=findViewById(R.id.TVresultat);



        //--------------------------------------------------

    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire0(View v) {
        String expression = TVcalcText.getText().toString().trim();
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length;

        if(expression.isEmpty() ){
            Toast.makeText(MainActivity.this,  getResources().getString(R.string.deb0), Toast.LENGTH_SHORT).show();
        }else if(expressionElements[l-1]=='/' ) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.div0), Toast.LENGTH_SHORT).show();
        }
      else  if(egalCliked==true){
          egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"0");
        }

        else TVcalcText.setText(expression + "0");
    }



    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire1(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "1");
       int maxLength = 15;
  String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
              if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"1");
        }
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire2(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "2");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
             if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"2");
        }

    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire3(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "3");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"3");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire4(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "4");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"4");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire5(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "5");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"5");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire6(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "6");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"6");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire7(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "7");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"7");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire8(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "8");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"8");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void Ecrire9(View v) {
        TVcalcText.setText(TVcalcText.getText().toString() + "9");
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;

        TVcalcText.setText(limitedText);
        if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"9");}
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void EcrirePlus(View v) {
        String expression = TVcalcText.getText().toString().trim()  ;
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        if(expression.isEmpty()){
            TVcalcText.setText(expression + "+");
        }
        else if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"+");}
        else if(Character.isDigit(expressionElements[l-1]) || expressionElements[l-1]==')') {
            TVcalcText.setText(expression + "+");
        }else if(expressionElements[l-1]=='-' ||expressionElements[l-1]=='/' ||expressionElements[l-1]=='×'){
            expressionElements[l - 1] = '+';
            TVcalcText.setText(new String(expressionElements));
        }
        else {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.ErreurMessage), Toast.LENGTH_SHORT).show();
        }
        //---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);

    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void EcrireM(View v) {
        String expression = TVcalcText.getText().toString().trim()  ;
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        if(expression.isEmpty()){
            TVcalcText.setText(expression + "-");
        }
      else if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"-");}
        else if(Character.isDigit(expressionElements[l-1]) || expressionElements[l-1]==')') {
            TVcalcText.setText(expression + "-");
        }else if (expressionElements[l-1]=='+' ||expressionElements[l-1]=='/' ||expressionElements[l-1]=='×'){
            expressionElements[l - 1] = '-';
            TVcalcText.setText(new String(expressionElements));
        }
        else {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.ErreurMessage), Toast.LENGTH_SHORT).show();
        }
        //---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void EcrireDev(View v) {
        String expression = TVcalcText.getText().toString().trim() ;
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        if( expression.isEmpty()){
            Toast.makeText(MainActivity.this, getResources().getString(R.string.debdev), Toast.LENGTH_SHORT).show();
        }else  if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"/");}
        else if(Character.isDigit(expressionElements[l-1]) || expressionElements[l-1]==')') {
            TVcalcText.setText(expression + "/");
        }else if (expressionElements[l-1]=='-' ||expressionElements[l-1]=='+' ||expressionElements[l-1]=='×'){
            expressionElements[l - 1] = '/';
            TVcalcText.setText(new String(expressionElements));
        }
        else {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.ErreurMessage), Toast.LENGTH_SHORT).show();
        }
        //---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void EcrireMult(View v) {
        String expression = TVcalcText.getText().toString().trim()  ;
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        if( expression.isEmpty()){
            Toast.makeText(MainActivity.this, getResources().getString(R.string.debMult), Toast.LENGTH_SHORT).show();
        }else  if(egalCliked==true){
            egalCliked=false ;
            TVcalcText.setText(TVresultat.getText().toString()+"×");}
        else if(Character.isDigit(expressionElements[l-1]) || expressionElements[l-1]==')') {
            TVcalcText.setText(expression + "×");

        }
        else if (expressionElements[l-1]=='-' ||expressionElements[l-1]=='/' ||expressionElements[l-1]=='+'){
            expressionElements[l - 1] = '×';
            TVcalcText.setText(new String(expressionElements));
        }
        else {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.ErreurMessage), Toast.LENGTH_SHORT).show();
        }
        //---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);
    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void EcrireParFermer(View v) {
        String expression = TVcalcText.getText().toString().trim()  ;
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        int comptParOuvr=0,comptParFerm=0;
        if(expression.isEmpty()){
            Toast.makeText(MainActivity.this, getResources().getString(R.string.comParOuvr), Toast.LENGTH_SHORT).show();
        }
        if(!expression.isEmpty()){
            for(int i =0 ;i<l ;i++){
                if(expressionElements[i]=='(') comptParOuvr++ ;
                if(expressionElements[i]==')') comptParFerm++ ;
            }
            if(Character.isDigit(expressionElements[l-1]) && comptParOuvr>comptParFerm){
                TVcalcText.setText(TVcalcText.getText().toString() + " ) ");
            }
            else if (comptParOuvr<=comptParFerm) Toast.makeText(MainActivity.this, getResources().getString(R.string.errParFerm), Toast.LENGTH_SHORT).show();
            else if (!Character.isDigit(expressionElements[l-1]) ) Toast.makeText(MainActivity.this, getResources().getString(R.string.errParPrec), Toast.LENGTH_SHORT).show();
        }
        //---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);


    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void EcrireParOuvrire(View v) {
        String expression = TVcalcText.getText().toString().trim();
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length;

        if (expression.isEmpty() || expressionElements[l - 1] == '(' || !Character.isDigit(expressionElements[l - 1])) {
            TVcalcText.setText(expression + " ( ");
        } else {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.errParOuvrePrec), Toast.LENGTH_SHORT).show();
        }
        //---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);

    }

    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-
    public void SupprimerTous(View v) {
        TVcalcText.setText("");
    }

    //-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-
    public void EcrireVerg(View v) {
        String expression = TVcalcText.getText().toString().trim()  ;
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        int IndiceP=0,IndiceOP=0 ;
        if(expression.isEmpty()) Toast.makeText(MainActivity.this, getResources().getString(R.string.commpoin), Toast.LENGTH_SHORT).show();
        if(!expression.isEmpty()){
            for(int i=0 ; i<l;i++){
                if(expressionElements[i]=='.' )  IndiceP = i ;
                if(expressionElements[i]=='+' || expressionElements[i]=='-' || expressionElements[i]=='×' ||expressionElements[i]=='/') IndiceOP=i ;
            }
            if(IndiceOP>=IndiceP && Character.isDigit(expressionElements[l-1])) TVcalcText.setText(TVcalcText.getText().toString() + ".");
            else if(IndiceOP<IndiceP)  Toast.makeText(MainActivity.this, getResources().getString(R.string.deuxPoints), Toast.LENGTH_SHORT).show();
            else Toast.makeText(MainActivity.this, getResources().getString(R.string.ErreurMessage), Toast.LENGTH_SHORT).show();
        }
//---------------------------------------------------
        int maxLength = 15;
        String originalText=TVcalcText.getText().toString() ;
        String limitedText = originalText.length() > maxLength ? originalText.substring(0, maxLength) : originalText;
        TVcalcText.setText(limitedText);

    }

    //-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-
    public void SupprimerCar(View v) {
        if (TVcalcText.getText().toString().length() > 0)
            TVcalcText.setText(TVcalcText.getText().toString().substring(0, TVcalcText.getText().toString().length() - 1));
    }

    //-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
    public void Egal(View v){
        String expression = TVcalcText.getText().toString();
        char[] expressionElements = expression.toCharArray();
        int l = expressionElements.length ;
        if(expression.isEmpty()){
            Toast.makeText(MainActivity.this , "Write your operations before !",Toast.LENGTH_SHORT).show();
        }
      else if(expressionElements[l-1]=='+')    Toast.makeText(MainActivity.this , "Erreur dans expression !",Toast.LENGTH_SHORT).show();

        else {


        Object[] exp = ExpVersObjects(expression);

            for (int i = 0 ; i<exp.length;i++){
                System.out.println(exp[i]);
            }
            System.out.println(evaluateExpression(exp));
           double res = evaluateExpression(exp);
           int resInt;
        if (res == (int) res) {
            resInt = (int) res;
            String numberString = Integer.toString(resInt); // Convertir l'entier en chaîne de caractères
            int numberOfDigits = numberString.length();

            if (numberOfDigits  >=5 && bol==true) {
                bol = false ;
                float currentSizeSP = TVresultat.getTextSize() / getResources().getDisplayMetrics().scaledDensity;
                // Réduire la taille de moitié (ajustez selon vos besoins)
                float newSizeSP = currentSizeSP / 2;
                TVresultat.setTextSize(TypedValue.COMPLEX_UNIT_SP, newSizeSP); // Définir la taille du texte en sp
            }

            TVresultat.setText("= " + resInt);
            egalCliked=true ;

        }

        else {
               String formatte = String.format("%.2f", res);
               TVresultat.setText("= "+formatte);
            egalCliked=true ;
        }


        }

    }



    public static Object[] ExpVersObjects(String expression) {
        expression = expression.trim();
        char[] expressionElements = expression.toCharArray();
        Stack<Object> expressionTransformer = new Stack<>();

        int i = 0;
        while (i < expressionElements.length) {
            if (Character.isDigit(expressionElements[i]) || (expressionElements[i] == '.' && i + 1 < expressionElements.length && Character.isDigit(expressionElements[i + 1]))) {
                StringBuilder nombre = new StringBuilder();
                while (i < expressionElements.length && (Character.isDigit(expressionElements[i]) || expressionElements[i] == '.')) {
                    nombre.append(expressionElements[i]);
                    i++;
                }
                if (nombre.indexOf(".") != -1) {
                    expressionTransformer.push(Double.parseDouble(nombre.toString()));
                } else {
                    expressionTransformer.push(Integer.parseInt(nombre.toString()));
                }
            } else if ("+-×/()".indexOf(expressionElements[i]) != -1) {
                expressionTransformer.push(expressionElements[i]);
                i++;
            } else {

                i++;
            }
        }

        Object[] result = new Object[expressionTransformer.size()];
        expressionTransformer.toArray(result);
        return result;
    }

    public static double evaluateExpression(Object[] expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        Stack<Object> tempStack = new Stack<>();

        for (Object token : expression) {
            if (token instanceof Integer || token instanceof Double) {
                numbers.push(Double.parseDouble(token.toString()));
            } else if (token instanceof Character) {
                char operator = (Character) token;
                if (operator == '(')  {
                    operators.push(operator);
                } else if (operator == ')') {
                    while (!operators.isEmpty() && operators.peek() != '(') {
                        double operand2 = numbers.pop();
                        double operand1 = numbers.pop();
                        numbers.push(applyOperator(operators.pop(), operand1, operand2));
                    }
                    operators.pop(); // Pop the '('
                } else {
                    while (!operators.isEmpty() && hasPrecedence(operator, operators.peek())) {
                        double operand2 = numbers.pop();
                        double operand1 = numbers.pop();
                        numbers.push(applyOperator(operators.pop(), operand1, operand2));
                    }
                    operators.push(operator);
                }
            }
        }

        while (!operators.isEmpty()) {
            double operand2 = numbers.pop();
            double operand1 = numbers.pop();
            numbers.push(applyOperator(operators.pop(), operand1, operand2));
        }

        return numbers.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '×' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    private static double applyOperator(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '×':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }




}