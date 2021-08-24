package com.goodayapps.notes.task_2;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.goodayapps.notes.R;

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        // Находим кнопку для загрузки
        ImageButton load = findViewById(R.id.button_load);
        // Находим поле для ввода
        EditText input = findViewById(R.id.link);
        // Находим ImageView куда будем грузить изображение
        ImageView preview = findViewById(R.id.preview);

        // Добавляем слушатель для взаимодействия с кнопкой
        load.setOnClickListener(v -> {
            // Берем текст из поля для ввода
            String link = input.getText().toString();

            // Работа с библиотекой.
            // Загрузка изображения в preview из нашей ссылки (link)
            Glide.with(this).load(link).into(preview);
        });
    }
}