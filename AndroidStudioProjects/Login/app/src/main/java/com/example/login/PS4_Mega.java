package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PS4_Mega extends AppCompatActivity {
    public EditText Preco2;
    public EditText Quantidade2;
    public TextView Total2;
    public Button Calcular2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps4_mega);
        Preco2 = findViewById(R.id.editTextPreco4);
        Quantidade2 = findViewById(R.id.editTextQuantidade4);
        Total2 = findViewById(R.id.textViewTotal4);
        Calcular2 = findViewById(R.id.btCalcular2);

    }

        public void Multiplicar2 (View view){
        String A = Preco2.getText().toString().trim();
        String B = Quantidade2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        Double E = C * D;
        Total2.setText(E.toString());

        double total = 0;



    }
}
