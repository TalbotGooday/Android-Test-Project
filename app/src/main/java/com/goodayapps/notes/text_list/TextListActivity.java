package com.goodayapps.notes.text_list;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.goodayapps.notes.R;

public class TextListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_list);

        // Ищем кнопку и записываем в переменную
        Button add = findViewById(R.id.button_add);
        // Ищем поле для ввода
        EditText input = findViewById(R.id.edit_text);
        // Ищем результирующий текст
        TextView textView = findViewById(R.id.textView);

        add.setOnClickListener(v -> {
            // Берем текст из поля для ввода
            Editable text = input.getText();

            // Если длина текста в поле для ввода равна 0, то прерываем работу кода
            if (text.length() == 0) {
                // прерываем работу кода
                return;
            }

            // берем весь текст из View для отображения результата
            CharSequence resultText = textView.getText();

            // Создаем переменную для разделителя
            String divider = "\n - ";

            // Обьединяем результат
            String result = resultText + divider + text;

            // Записываем результат во View для отображения результата
            textView.setText(result);

            // Очищаем поле для ввода
            input.getText().clear();
        });
    }
}