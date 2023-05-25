package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        Spinner spinner = findViewById(R.id.spinner_difficulty);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.difficulty_levels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        ImageView star1 = findViewById(R.id.imageView2);
        ImageView star2 = findViewById(R.id.imageView6);
        ImageView star3 = findViewById(R.id.imageView8);
        ImageView star4 = findViewById(R.id.imageView9);
        ImageView star5 = findViewById(R.id.imageView10);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: // Сложность 1
                        star1.setAlpha(1.0f);
                        star2.setAlpha(0.3f);
                        star3.setAlpha(0.3f);
                        star4.setAlpha(0.3f);
                        star5.setAlpha(0.3f);
                        break;
                    case 1: // Сложность 2
                        star1.setAlpha(1.0f);
                        star2.setAlpha(1.0f);
                        star3.setAlpha(0.3f);
                        star4.setAlpha(0.3f);
                        star5.setAlpha(0.3f);
                        break;
                    case 2: // Сложность 3
                        star1.setAlpha(1.0f);
                        star2.setAlpha(1.0f);
                        star3.setAlpha(1.0f);
                        star4.setAlpha(0.3f);
                        star5.setAlpha(0.3f);
                        break;
                    case 3: // Сложность 4
                        star1.setAlpha(1.0f);
                        star2.setAlpha(1.0f);
                        star3.setAlpha(1.0f);
                        star4.setAlpha(1.0f);
                        star5.setAlpha(0.3f);
                        break;
                    case 4: // Сложность 5
                        star1.setAlpha(1.0f);
                        star2.setAlpha(1.0f);
                        star3.setAlpha(1.0f);
                        star4.setAlpha(1.0f);
                        star5.setAlpha(1.0f);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}




