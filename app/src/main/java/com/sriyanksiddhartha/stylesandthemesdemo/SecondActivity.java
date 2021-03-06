package com.sriyanksiddhartha.stylesandthemesdemo;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;

/**
 * Created by Kenata on 2017-12-01.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedINstanceState) {
        super.onCreate(savedINstanceState);
        setContentView(R.layout.activity_button);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Explode explode = new Explode();
            explode.setDuration(1000);
            getWindow().setEnterTransition(explode);
        }
    }
}
