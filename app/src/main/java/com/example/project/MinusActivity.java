package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MinusActivity extends AppCompatActivity {
    private TextView numb1;
    private TextView numb2;
    private EditText answer;
    private Button check;
    private int num1;
    private int num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Minus minus = new Minus();
        num1 = minus.num1;
        num2 = minus.num2;


        numb1 = findViewById(R.id.numb1);
        numb1.setText(Integer.toString(num1));
        numb2 = findViewById(R.id.numb2);
        numb2.setText(Integer.toString(num2));
        answer = findViewById(R.id.answer);
        check = findViewById(R.id.check);
        check.setOnClickListener(listener);

    }

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Minus minus = new Minus();
            int answer = num1 - num2;
            String text = MinusActivity.this.answer.getText().toString();
            int result;
            System.out.println(answer);
            if (!text.equals("")) {
                result = Integer.parseInt(text);
            } else {
                return;
            }

            if (result == answer) {
                generateNumbers();
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Все правильно:)!!!", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Не правильно:( Попробуй еще раз", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };

    private void generateNumbers() {

        Minus minus = new Minus();
        num1 = minus.num1;
        num2 = minus.num2;

        numb1.setText(Integer.toString(num1));
        numb2.setText(Integer.toString(num2));
    }
}




