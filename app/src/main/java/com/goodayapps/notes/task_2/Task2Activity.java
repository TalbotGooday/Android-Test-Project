package com.goodayapps.notes.task_2;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.goodayapps.notes.R;

import java.util.ArrayList;
import java.util.List;

public class Task2Activity extends AppCompatActivity {

    // Находим кнопку для загрузки
    ImageButton load;

    // Находим поле для ввода
    EditText input;

    // Находим ImageView куда будем грузить изображение
    ImageView preview1;
    ImageView preview2;
    ImageView preview3;
    ImageView preview4;


    List<ImageView> previews = new ArrayList<>();

    // Счетчик, который помогает взять правильный ImageView
    private int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_task2);

        load = findViewById(R.id.button_load);
        input = findViewById(R.id.link);
        preview1 = findViewById(R.id.preview1);
        preview2 = findViewById(R.id.preview2);
        preview3= findViewById(R.id.preview3);
        preview4 = findViewById(R.id.preview4);

        previews.add(preview1);
        previews.add(preview2);
        previews.add(preview3);
        previews.add(preview4);

        // Добавляем слушатель для взаимодействия с кнопкой
        load.setOnClickListener(v -> {
            // Берем текст из поля для ввода
            String link = input.getText().toString();

            loadNext(link);
        });
    }

    private void loadNext(String link) {
        int nextIndex = ++counter;

        if (nextIndex > previews.size() - 1) {
            counter = 0;
            nextIndex = 0;
        }

        ImageView preview = previews.get(nextIndex);

        // Работа с библиотекой.
        // Загрузка изображения в preview из нашей ссылки (link)
        Glide.with(this).load(link).into(preview);
    }
}