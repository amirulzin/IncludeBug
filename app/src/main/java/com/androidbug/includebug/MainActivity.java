package com.androidbug.includebug;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                                   .replace(R.id.fragmentContainer, new FragmentFirst())
                                   .commit();
    }

    public void navToSecondFragment() {
        getSupportFragmentManager().beginTransaction()
                                   .replace(R.id.fragmentContainer, new FragmentSecond())
                                   .addToBackStack(null)
                                   .commit();
    }
}
