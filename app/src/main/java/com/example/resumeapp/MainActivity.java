package com.example.resumeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.resumeapp.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Now we call the HomeFragment
        setHomeFragment();
    }

    // Home fragment

    void setHomeFragment(){

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

    }
}