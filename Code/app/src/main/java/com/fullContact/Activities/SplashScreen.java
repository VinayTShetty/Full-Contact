package com.fullContact.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.fullContact.R;

public class SplashScreen extends AppCompatActivity {
    TextView textView_tagline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        hideStatusBar();
        intializeViews();
    }

    private void hideStatusBar() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void intializeViews() {
        textView_tagline=(TextView)findViewById(R.id.textView_tagline_id);
        textView_tagline.setText("@ Finger Tip");
    }
}