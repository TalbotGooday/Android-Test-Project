package com.goodayapps.notes.start_screen;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.goodayapps.notes.R;
import com.goodayapps.notes.text_list.TextListActivity;

import java.util.Random;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    private Button suchButton;
    private Button wowButton;
    private Button actionMove;
    private TextView text;
    private EditText input;

    private Boolean value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        suchButton = findViewById(R.id.action_notes);
        wowButton = findViewById(R.id.super_knopushka);
        actionMove = findViewById(R.id.action_move);
        text = findViewById(R.id.text_with_color);
        input = findViewById(R.id.input);

        suchButton.setOnClickListener(v ->
                startActivity(new Intent(this, TextListActivity.class)));
        wowButton.setOnClickListener(this);

        actionMove.setOnClickListener(v -> {
            text.setText(input.getText().toString());
        });
    }

    @Override
    public void onClick(View v) {

        text.setTextColor(createRandomColor());
        suchButton.setTextColor(createRandomColor());
        wowButton.setTextColor(createRandomColor());
    }

    private int createRandomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}