package com.jokerslab.android.morsecodeandroid;

import android.jokerslab.com.morsecodeandroid.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MorseCodeActivity extends AppCompatActivity {

    private static final String TAG = MorseCodeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_code);

        String morseCode = new MorseCodeCore().getMorseCodeFromFile(null);
        Log.d(TAG,morseCode);
    }
}
