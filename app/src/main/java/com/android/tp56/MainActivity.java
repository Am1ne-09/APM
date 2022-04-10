package com.android.tp56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt; TextView  result;RadioButton check1;RadioGroup radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edit_float);
        result = findViewById(R.id.result);
        radio= findViewById(R.id.RadioGroup);
    }
    float dinarsToEuro(float valeurDinar) { return (float) (valeurDinar /220); }
    float euroToDinar(float valeurEuro) { return (float) (valeurEuro * 220); }

    public void click(View view) {
        float q=Float.parseFloat(String.valueOf(edt.getText()));
        int radioid=radio.getCheckedRadioButtonId();
        check1=findViewById(radioid);
        if (check1.getText().equals("Euro to Dinar algerien")){ result.setText(euroToDinar(q)+""); }
        if (check1.getText().equals("Dinar algerien to Euro")){ result.setText( dinarsToEuro(q)+""); }
    }

    public void nextActivity(View v){
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);

    }
}