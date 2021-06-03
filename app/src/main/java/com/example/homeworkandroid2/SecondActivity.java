package com.example.homeworkandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private EditText etText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        etText = findViewById(R.id.et_text);
        button = findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,etText.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("text",etText.getText().toString());
                startActivity(intent);

            }
        });


    }
}