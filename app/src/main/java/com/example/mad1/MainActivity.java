package com.example.mad1;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button resButton;
    CheckBox c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resButton = findViewById(R.id.resButton);
        resButton.setOnClickListener(this::showResult);
    }
    void showResult(View v){
        CheckBox[] chks = {findViewById(R.id.checkBox1),findViewById(R.id.checkBox2),findViewById(R.id.checkBox3)};
        StringBuilder result = new StringBuilder("Selected: ");
        for(CheckBox chk:chks){
            result.append(chk.isChecked() ? chk.getText() + " " : " ");
        }
        Toast.makeText(getApplicationContext(), result,Toast.LENGTH_SHORT).show();
    }
}