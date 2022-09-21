package com.henrique.calcmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mniAdi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mni_adi);

        EditText edtNum1 = findViewById(R.id.edtNum1);
        EditText edtNum2 = findViewById(R.id.edtNum2);
        Button btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(view -> {
            Double num1 = Double.parseDouble(edtNum1.getText().toString());
            Double num2 = Double.parseDouble(edtNum2.getText().toString());

            Toast.makeText(this, "A soma é: " + (num1 + num2), Toast.LENGTH_SHORT).show();
        });
    }
}