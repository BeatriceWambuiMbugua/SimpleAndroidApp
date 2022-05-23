package com.digitalspaceguru.simpleandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
        moodDialogFragment.show(fragmentManager, "Sample Fragment");
    }
}