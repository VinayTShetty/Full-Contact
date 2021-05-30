package com.fullContact.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.fullContact.MainActivity;
import com.fullContact.R;

public class SplashScreen extends AppCompatActivity {
    Animation topanimation,bottomanimation;
    ImageView imageview_splashLogo;
    TextView textview_app_Name,textView_tagline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        hideStatusBar();
        intializeViews();
        setAnimation();
        navigateToMainActivity();
    }

    private void navigateToMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, LoginScreen.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }

    private void hideStatusBar() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void intializeViews() {
        textView_tagline=(TextView)findViewById(R.id.textView_tagline_id);
        textView_tagline.setText("@ Finger Tip");
        textview_app_Name=(TextView)findViewById(R.id.textview_app_Name_id);
        imageview_splashLogo=(ImageView)findViewById(R.id.imageview_splashLogo_id);
        topanimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
    }
    private void setAnimation(){
        imageview_splashLogo.setAnimation(topanimation);
        textview_app_Name.setAnimation(bottomanimation);
        textView_tagline.setAnimation(bottomanimation);
    }

}