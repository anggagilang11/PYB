package com.pyb.pybapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.pyb.pybapp.databinding.ActivityMainBinding;
import com.pyb.pybapp.preferences.UserPreferences;
import com.pyb.pybapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        UserPreferences userPreferences = new UserPreferences(this);
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }
    }
}