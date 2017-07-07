package com.android_developer.soumya.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public String inputExp;
    public  Double value1;
    public  Double value2;
    public  Double ans;
    public  char symbol;
    public int symbolsAddedNo;
    TextView oldExpr;
    TextView newExpr;
    public int n,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oldExpr = (TextView)(findViewById(R.id.oldTextView));
        newExpr = (TextView)(findViewById(R.id.newTextView));


    }
    public void buttonCClicked(View view)
    {
        inputExp="";
        value1=0.0;
        value2=0.0;
        ans=0.0;
        symbol='p';
        symbolsAddedNo=0;
        oldExpr.setText("");
        newExpr.setText("");
    }
    public void button0Clicked(View view)
    {
        inputExp=inputExp+"0";
        newExpr.setText(inputExp);
    }
    public void button1Clicked(View view)
    {
        inputExp=inputExp+"1";
        newExpr.setText(inputExp);
    }
    public void button2Clicked(View view)
    {
        inputExp=inputExp+"2";
        newExpr.setText(inputExp);
    }
    public void button3Clicked(View view)
    {
        inputExp=inputExp+"3";
        newExpr.setText(inputExp);
    }
    public void button4Clicked(View view)
    {
        inputExp=inputExp+"4";
        newExpr.setText(inputExp);
    }
    public void button5Clicked(View view)
    {
        inputExp=inputExp+"5";
        newExpr.setText(inputExp);
    }
    public void button6Clicked(View view)
    {
        inputExp=inputExp+"6";
        newExpr.setText(inputExp);
    }
    public void button7Clicked(View view)
    {
        inputExp=inputExp+"7";
        newExpr.setText(inputExp);
    }
    public void button8Clicked(View view)
    {
        inputExp=inputExp+"8";
        newExpr.setText(inputExp);
    }
    public void button9Clicked(View view)
    {
        inputExp=inputExp+"9";
        newExpr.setText(inputExp);
    }
    public void buttonAddClicked(View view)
    {
        inputExp=inputExp+"+";
        newExpr.setText(inputExp);
        symbol='+';
        symbolsAddedNo++;
    }
    public void buttonSubClicked(View view)
    {
        inputExp=inputExp+"-";
        newExpr.setText(inputExp);
        symbol='-';
        symbolsAddedNo++;
    }
    public void buttonMulClicked(View view)
    {
        inputExp=inputExp+"*";
        newExpr.setText(inputExp);
        symbol='*';
        symbolsAddedNo++;
    }
    public void buttonDivClicked(View view)
    {
        inputExp=inputExp+"/";
        newExpr.setText(inputExp);
        symbol='/';
        symbolsAddedNo++;
    }
    public void buttonCalcClicked(View view)
    {
        if(symbolsAddedNo==0)
        {
            ans=Double.parseDouble(inputExp);
            newExpr.setText(inputExp);
            oldExpr.setText(inputExp);
        }
        else if(symbolsAddedNo>1){
            newExpr.setText("Error");
            symbolsAddedNo=0;
            inputExp="";
        }
        else if(symbolsAddedNo==1){
                n=inputExp.length();
                if(inputExp.charAt(0)==symbol||inputExp.charAt(n)==symbol){
                    oldExpr.setText("error");
                    newExpr.setText("symbol should be in btw values");
                }
                else{
                        int symbolIndex=-1;
                        for (i=0;i<n;i++){
                            if(inputExp.charAt(i)==symbol){
                            symbolIndex=i;
                                break;
                        }
                    value1=Double.parseDouble(inputExp.substring(0,symbolIndex));
                    value2=Double.parseDouble(inputExp.substring(symbolIndex+1));
                    switch(symbol) {
                        case '+':
                            ans=value1+value2;
                            break;
                        case '-':
                            ans=value1-value2;
                            break;
                        case '*':
                            ans=value1*value2;
                            break;
                        case '/':
                            ans=value1/value2;
                            break;
                        default:
                            oldExpr.setText("Error");
                            newExpr.setText("unexpected input");
                    }

            }
        }
    }
}}
