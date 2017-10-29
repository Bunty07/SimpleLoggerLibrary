package com.ananta.logging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ananta.logger.utils.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.logDebug("MainActivity");
        Logger.logError("MainActivity");
        Logger.logInfo("MainActivity");
    }
}
