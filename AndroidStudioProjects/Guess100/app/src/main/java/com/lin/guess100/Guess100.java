package com.lin.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Guess100 extends AppCompatActivity {
    int secnumber = 55 ;//new Random().nextInt(100)+1;
    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess100);
        TextView secret = (TextView) findViewById(R.id.secret);
        TextView info = (TextView) findViewById(R.id.info);
        EditText ednumber = (EditText) findViewById(R.id.number);
        number = Integer.parseInt(ednumber.toString());
        Button send = (Button) findViewById(R.id.send);
        secret.setText("55");

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int change = 0;
                int upline = 100;
                int doline = 1;
        if(number>secnumber){
            new AlertDialog.Builder(Guess100.this)
                    .setMessage(doline+"to"+number)
                    .setPositiveButton("繼續",null)
                    .show();
            number =upline;
            upline =change;

        }else if(number<secnumber)
            new AlertDialog.Builder(Guess100.this)
                    .setMessage(number+"to"+upline)
                    .setPositiveButton("繼續",null)
                    .show();
                number =doline;
                doline =change;
            }

        });}
    }
