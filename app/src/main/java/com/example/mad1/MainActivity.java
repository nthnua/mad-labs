package com.example.mad1;

import android.graphics.Color;
import android.view.*;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View c = findViewById(R.id.c);
        registerForContextMenu(c);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.m1,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        View c = findViewById(R.id.c);
        switch (item.getItemId()){
            case R.id.i1:
                c.setBackgroundColor(Color.rgb(0,255,0));
                break;
            case R.id.i2:
                c.setBackgroundColor(Color.rgb(200,0,0));
                break;
            case R.id.i3:
                Random r = new Random();
                c.setBackgroundColor(Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
        }
        return super.onContextItemSelected(item);
    }

}