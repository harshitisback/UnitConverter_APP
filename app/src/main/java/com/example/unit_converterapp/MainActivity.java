package com.example.unit_converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, result_text;
    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcometext);
        result_text = findViewById(R.id.resultTextView);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilos_ent = Double.parseDouble(editText.getText().toString());
                result_text.setText(""+ String.format("%.2f",convertToPound(kilos_ent))+"lb");
                editText.setText("");
            }
        });


    }

    public double convertToPound(double kilos){
        return  kilos * 2.205;
    }
}