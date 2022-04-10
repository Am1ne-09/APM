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

public class MainActivity2 extends AppCompatActivity {
    EditText edt2;
    TextView result2;
    RadioButton check12;
    RadioGroup radio2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt2=findViewById(R.id.edit_text2);
        result2=findViewById(R.id.result2);
        radio2=findViewById(R.id.RadioGroup2);
    }

    float CtoF(float valeurC){return ((9f/5)*valeurC+32);}
    float FtoC(float valeurF){return ((5f/9)*(valeurF-32));}
    public void click2 (View view)

    {
        float q=Float.parseFloat(String.valueOf(edt2.getText()));
        int radioid2=radio2.getCheckedRadioButtonId();
        check12=findViewById(radioid2);
        if(check12.getText().equals("C = > F")){result2.setText(CtoF(q)+"");}
        if(check12.getText().equals("F = > C")){result2.setText(FtoC(q)+"");}
    }

    public void previousActivity(View v){
        Intent i2=new Intent(this,MainActivity.class);
        startActivity(i2);
    }

}