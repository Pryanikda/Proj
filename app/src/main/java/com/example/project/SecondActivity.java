package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener1);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(getApplicationContext(), AnswerActivity.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(getApplicationContext(), MinusActivity.class);
            startActivity(intent);

        }
    };

}







