package com.example.chuong5_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitWidget();
        btnTst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Đây là Toast", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // Init Widget - Khanhvtrng12
    void InitWidget(){
        btnTst = findViewById(R.id.btn_Toast);
    }
}