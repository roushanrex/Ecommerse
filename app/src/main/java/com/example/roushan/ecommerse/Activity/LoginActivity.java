package com.example.roushan.ecommerse.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.FrameLayout;

import com.example.roushan.ecommerse.Fragment.LoginFragment;
import com.example.roushan.ecommerse.R;

public class LoginActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    public static boolean onBackpress = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        frameLayout = findViewById(R.id.framlayout_login);

        loadFragment(new LoginFragment());

    }


    private void loadFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(frameLayout.getId(),fragment);
        fragmentTransaction.commit();

    }


}
