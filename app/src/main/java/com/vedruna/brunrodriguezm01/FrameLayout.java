package com.vedruna.brunrodriguezm01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FrameLayout extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        OnNavigationItemSelectedListener();

    }
    protected void OnNavigationItemSelectedListener() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();

        bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFragment);
            } else if (item.getItemId() == R.id.navigation_contador) {
                navController.navigate(R.id.contadorFragment);
            } else if (item.getItemId() == R.id.navigation_exit) {
                navController.navigate(R.id.exitFragment);
                finish();
            }
            return true;
        });
    }
}
