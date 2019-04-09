package com.example.roushan.ecommerse.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roushan.ecommerse.R;

import static com.example.roushan.ecommerse.Activity.LoginActivity.onBackpress;

public class RegisterFragment extends Fragment {


    public RegisterFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view= inflater.inflate(R.layout.fragment_register, container, false);
        onBackpress = true;
         return view;

    }


    private void loadFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framlayout_login,fragment);
        fragmentTransaction.commit();

    }


}
