package com.example.raj.tic;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

import static android.R.color.holo_green_dark;
import static android.R.color.holo_green_light;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,exit;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        btn1 = (Button) findViewById( R.id.btn1 );
        btn2 = (Button) findViewById( R.id.btn2 );
        btn3 = (Button) findViewById( R.id.btn3 );
        btn4 = (Button) findViewById( R.id.btn4 );
        btn5 = (Button) findViewById( R.id.btn5 );
        btn6 = (Button) findViewById( R.id.btn6 );
        btn7 = (Button) findViewById( R.id.btn7 );
        btn8 = (Button) findViewById( R.id.btn8 );
        btn9 = (Button) findViewById( R.id.btn9 );
        exit=findViewById( R.id.exit );
        exit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View view) {

                finish();
            }
        } );
    }

    public void Check (View a) {
        Button btnCurrent = (Button) a;
        if (flag == 0) {
            btnCurrent.setText( "X" );
            btnCurrent.setEnabled( false );
            flag = 1;
        } else {
            btnCurrent.setText( "0" );
            btnCurrent.setEnabled( false );
            flag = 0;

        }


        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();

        //Condition
        if (b1.equals( b2 ) && b2.equals( b3 ) && !b3.equals( "" )) {
            //1
            Toast.makeText( this, "Winner is:" + b1, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (b4.equals( b5 ) && b5.equals( b6 ) && !b6.equals( "" )) {
            //2
            Toast.makeText( this, "Winner is:" + b4, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (b7.equals( b8 ) && b8.equals( b9 ) && !b9.equals( "" )) {
            //3
            Toast.makeText( this, "Winner is:" + b7, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (b1.equals( b4 ) && b4.equals( b7 ) && !b7.equals( "" )) {
            //4
            Toast.makeText( this, "Winner is:" + b1, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (b2.equals( b5 ) && b5.equals( b8 ) && !b8.equals( "" )) {
            //5
            Toast.makeText( this, "Winner is:" + b2, Toast.LENGTH_SHORT ).show();
            Restart();

        } else if (b3.equals( b6 ) && b6.equals( b9 ) && !b9.equals( "" )) {
            //6
            Toast.makeText( this, "Winner is:" + b3, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (b1.equals( b5 ) && b5.equals( b9 ) && !b9.equals( "" )) {
            //7
            Toast.makeText( this, "Winner is:" + b1, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (b3.equals( b5 ) && b5.equals( b7 ) && !b7.equals( "" )) {
            //8
            Toast.makeText( this, "Winner is:" + b3, Toast.LENGTH_SHORT ).show();
            Restart();
        } else if (!b1.equals( "" ) && !b2.equals( "" ) && !b3.equals( "" ) && !b4.equals( "" ) && !b5.equals( "" ) && !b6.equals( "" ) && !b7.equals( "" ) && !b8.equals( "" ) && !b9.equals( "" )) {
            Toast.makeText( this, "Match is Draw.", Toast.LENGTH_SHORT ).show();
            Restart();

        }
    }

    private void Restart () {

        btn1.setText( "" );
        btn1.setEnabled( true );
        btn2.setText( "" );
        btn2.setEnabled( true );
        btn3.setText( "" );
        btn3.setEnabled( true );
        btn4.setText( "" );
        btn4.setEnabled( true );
        btn5.setText( "" );
        btn5.setEnabled( true );
        btn6.setText( "" );
        btn6.setEnabled( true );
        btn7.setText( "" );
        btn7.setEnabled( true );
        btn8.setText( "" );
        btn8.setEnabled( true );
        btn9.setText( "" );
        btn9.setEnabled( true );

    }
}