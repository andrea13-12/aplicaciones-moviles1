package com.example.application01;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // declarando propiedades de clase
    private EditText etn1;
    private EditText etn2;
    private EditText etsuma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /* Asignar las propiedades de los componentes a la variable */
        etn1=(EditText)findViewById(R.id.txtn1);
        etn2=(EditText)findViewById(R.id.txtn2);
        etsuma=(EditText)findViewById(R.id.txtsuma);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void suma(View view)
    {
        String valor1=etn1.getText().toString();
        String valor2=etn2.getText().toString();
        int num1= Integer.parseInt(valor1);
        int num2= Integer.parseInt(valor2);
        int suma= num1+num2;
        String resultado= String.valueOf(suma);
        etsuma.setText(resultado);
    }

    public void nuevo(View view){
        etn1.setText("");
        etn2.setText("");
        etsuma.setText("");
        etn1.requestFocus();
    }
}
