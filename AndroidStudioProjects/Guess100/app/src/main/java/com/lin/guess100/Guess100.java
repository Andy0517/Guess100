package com.lin.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Guess100 extends AppCompatActivity {
    int secnumber = 55 ;//new Random().nextInt(100)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess100);
        TextView secret = (TextView) findViewById(R.id.secret);
        TextView info = (TextView) findViewById(R.id.info);
        EditText number = (EditText) findViewById(R.id.number);
        Button send = (Button) findViewById(R.id.send);
        secret.setText("55");
    }
    public void send(View view){

    }
}
