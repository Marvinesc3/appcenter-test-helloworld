package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

/* appcenter imports */
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "e97dc62c-0d10-4b08-8e44-809397fda7d7",
                Analytics.class, Crashes.class);
    }
}