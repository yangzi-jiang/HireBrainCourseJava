package com.hirebrain.hirebraincourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view) {
//        Log.i("Info", "Button Clicked");
        String url = "http://learn.hirebrain.com";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        // Note the Chooser below. If no applications match,
        // Android displays a system message.So here there is no need for try-catch.
        startActivity(Intent.createChooser(intent, "Browse with"));
    }

    public void logoutFunction(View view) {
        String url = "http://learn.hirebrain.com/users/logout";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        // Note the Chooser below. If no applications match,
        // Android displays a system message.So here there is no need for try-catch.
        startActivity(Intent.createChooser(intent, "Browse with"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}