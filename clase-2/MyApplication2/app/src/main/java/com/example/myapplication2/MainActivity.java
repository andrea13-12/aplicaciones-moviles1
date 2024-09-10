package com.example.myapplication2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etnum1, etnum2;
    private EditText etsuma, etresta, etproducto, etdivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etnum1= (EditText)findViewById(R.id.txtnum1);
        etnum2= (EditText)findViewById(R.id.txtnum2);
        etsuma= (EditText)findViewById(R.id.txtsuma);
        etresta= (EditText)findViewById(R.id.txtresta);
        etproducto= (EditText)findViewById(R.id.txtproducto);
        etdivision= (EditText)findViewById(R.id.txtdivision);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public int suma(int xnum1, int xnum2){
        return xnum1+xnum2;
    }

    public int resta(int xnum1, int xnum2){
        return xnum1-xnum2;
    }

    public int producto(int xnum1, int xnum2){
        return xnum1*xnum2;
    }

    public int division(int xnum1, int xnum2){
        return xnum1/xnum2;
    }

    public void nuevo(View view){
        etnum1.setText("");
        etnum2.setText("");
        etsuma.setText("");
        etresta.setText("");
        etdivision.setText("");
        etproducto.setText("");
        etnum1.requestFocus();
    }

    public void calcular(View view){
        int num1= Integer.parseInt(etnum1.getText().toString());
        int num2= Integer.parseInt(etnum2.getText().toString());
        int xsuma= suma(num1,num2);
        int xresta= resta(num1,num2);
        int xproducto= producto(num1,num2);
        double xdivision= division(num1,num2);

        etsuma.setText(String.valueOf(xsuma));
        etresta.setText(String.valueOf(xresta));
        etproducto.setText(String.valueOf(xproducto));
        etdivision.setText(String.valueOf(xdivision));
    }
}