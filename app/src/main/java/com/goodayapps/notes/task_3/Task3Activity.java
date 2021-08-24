package com.goodayapps.notes.task_3;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class Task3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Заменяем вывод через System.out на Log.d

        // System.out.println("Я изучаю");
        Log.d("TAG TEST", "Я изучаю");

        // System.out.println ("Java");
        Log.d("TAG TEST", "Java");
    }
}
