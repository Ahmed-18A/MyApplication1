package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView etWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWelcome=findViewById(R.id.text1);
    }
    public void change_text(View view){
        etWelcome.setText("this is my first app");
    }
    public void finishApp(View view){
        finish();
        System.exit(0);
    }
}