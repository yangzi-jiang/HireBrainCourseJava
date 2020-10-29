package com.hirebrain.hirebraincourse;
import android.content.Intent;
import android.os.Bundle;
import com.hirebrain.hirebraincourse.MainActivity;

public class SplashActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Start home activity
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        // close splash activity
        finish();
    }
}