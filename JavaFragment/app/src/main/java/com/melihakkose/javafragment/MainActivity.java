package com.melihakkose.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirst(View view){
        //fragmentTransaction.add ile ikisini ayni anda gosteriyor
        //fragmentTransaction.replace ustune fragmenti yaziyor
        //FRAGMENTLARI ACTIVITY ILE BAGLAMAK
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        FirstFragment firstFragment=new FirstFragment();

        fragmentTransaction.replace(R.id.frame_layout,firstFragment).commit();


    }
    public void goToSecond(View view){
        //fragmentTransaction.add ile ikisini ayni anda gosteriyor
        //fragmentTransaction.replace ustune fragmenti yaziyor
        //FRAGMENTLARI ACTIVITY ILE BAGLAMAK
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        SecondFragment secondFragment=new SecondFragment();

        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();

    }
}