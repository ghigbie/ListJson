package com.geogehigbie.listjsonparse.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by georgehigbie on 3/11/17.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
