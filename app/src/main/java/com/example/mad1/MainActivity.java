package com.example.mad1;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button addButton;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.AddButton);
        addButton.setOnClickListener(this::showResult);
    }
    void showResult(View v){
        t1 = findViewById(R.id.no1);
        t2 = findViewById(R.id.no2);
        Double sum = Double.parseDouble(t1.getText().toString()) +Double.parseDouble(t2.getText().toString());
        Toast.makeText(getApplicationContext(),"Sum is: " + sum,Toast.LENGTH_SHORT).show();
    }
}