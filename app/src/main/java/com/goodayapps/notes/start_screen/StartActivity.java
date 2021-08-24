package com.goodayapps.notes.start_screen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.goodayapps.notes.R;
import com.goodayapps.notes.task_1.Task1Activity;
import com.goodayapps.notes.task_2.Task2Activity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Находим кнопку для Задания 1. Id кнопки task_1
        Button task_1 = findViewById(R.id.task_1);

        // По нажатию на кнопку открываем экран с Заданием 1
        task_1.setOnClickListener(v -> {
            // Для открытия экрана используем функцию startActivity,
            // которая доступна в Activity и в Fragment
            // В аргументы функции передаем Intent (http://developer.alexanderklimov.ru/android/theory/intent.php)
            // При создании интента нам нужно две вещи:
            //    1. Контекст (Context: http://developer.alexanderklimov.ru/android/theory/context.php)
            //    2. Класс нашего второго экрана в виде Activity.class

            startActivity(new Intent(
                    /*контекст*/this,
                    /*класс экрана*/ Task1Activity.class
            ));
        });

        // Повторяем для task_2
        Button task_2 = findViewById(R.id.task_2);

        task_2.setOnClickListener(v -> {
            startActivity(new Intent(
                    /*контекст*/this,
                    /*класс экрана*/ Task2Activity.class
            ));
        });
    }
}