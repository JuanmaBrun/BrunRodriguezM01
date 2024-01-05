package com.vedruna.brunrodriguezm01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText user = findViewById(R.id.editTxtUser);
        EditText pass = findViewById(R.id.editTxtPass);
        Button login = findViewById(R.id.btnLogin);
        TextView status = findViewById(R.id.txtStatus);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    String username = user.getText().toString();
                    status.setText("Usuario y contraseña correctos");
                    Intent intent = new Intent(getApplicationContext(), ContadorActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    status.setText("Usuario o conraseña incorrectos");
                }
            }
        });
    }
}