package com.vedruna.brunrodriguezm01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        String username = getIntent().getStringExtra("username");
        TextView txtUsername = findViewById(R.id.txtUsername);

        txtUsername.setText("Bienvenido " + username);
    }
}
