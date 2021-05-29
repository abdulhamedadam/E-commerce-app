package com.example.e_commereapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    public static int SPLASH_TIMER=5000;
    // inflate splash screen vraibles(002    )
    ImageView backgroundimageView;
    TextView poweredbyline;
    //Animation inflate variables(002)
    Animation slidanim,bottomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        backgroundimageView=findViewById(R.id.backgroind_image);
        poweredbyline=findViewById(R.id.powered_by_line);
        //Animation(002)
        slidanim= AnimationUtils.loadAnimation(this,R.anim.slide_anim);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        //set Animation on element(002)
        backgroundimageView.setAnimation(slidanim);
        poweredbyline.setAnimation(bottomanim);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent loginIntent=new Intent(getApplicationContext(),RegisterActivity.class);
               startActivity(loginIntent);
               finish();
           }
       },SPLASH_TIMER);


    }
}