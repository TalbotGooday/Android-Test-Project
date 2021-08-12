package com.goodayapps.notes.start_screen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.goodayapps.notes.R;
import com.goodayapps.notes.task_1.Task1Activity;

public class StartActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button task_1 = findViewById(R.id.task_1);

        task_1.setOnClickListener(v ->
                startActivity(new Intent(this, Task1Activity.class)));
    }
}