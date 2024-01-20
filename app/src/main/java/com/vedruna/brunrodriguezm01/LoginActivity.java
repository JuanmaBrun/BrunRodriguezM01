package com.vedruna.brunrodriguezm01;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.vedruna.brunrodriguezm01.interfaces.CRUDInterface;
import com.vedruna.brunrodriguezm01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    List<Product> products;
    CRUDInterface crudInterface;

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
                    Intent intent = new Intent(getApplicationContext(), FrameLayout.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    status.setText("Usuario o conraseña incorrectos");
                }
            }
        });

        getAll();
    }

    private void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.35:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        crudInterface = retrofit.create(CRUDInterface.class);
        Call<List<Product>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Product>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (!response.isSuccessful()) {
                    Log.e("Response err: ", response.message());
                    return;
                }
                products = response.body();
                products.forEach(p -> Log.i("Prods: ", p.toString()));
            }
            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("Throw err: ", t.getMessage());
            }
        });
    }

}