package com.example.rafae.treattruck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Tractor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tractor);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
