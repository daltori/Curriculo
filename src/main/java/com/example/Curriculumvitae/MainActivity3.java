package com.example.Curriculumvitae;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.utils.Utils;



public class MainActivity3 extends AppCompatActivity {

    public String url = "https://api.whatsapp.com/send?phone=573138764816&text=mensaje";
    public String url1 = "https://www.linkedin.com/in/david-torres-503839202/";
    public String url2 = "https://github.com/daltori";
    AnimationDrawable rocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       LinearLayout rocketImage = (LinearLayout) findViewById(R.id.bac);
        rocketImage.setBackgroundResource(R.drawable.animationlist);
        rocketAnimation = (AnimationDrawable) rocketImage.getBackground();

        rocketAnimation.start();



    }
    @Override
    protected void onResume () {
        super.onResume();
        LottieAnimationView imagen =findViewById(R.id.likeImagenView);
        LottieAnimationView imagen1 =findViewById(R.id.likeImagenView1);
        LottieAnimationView imagen2 =findViewById(R.id.likeImagenView2);
        likeAnimation(imagen,R.raw.whatsapp2);
        likeAnimation(imagen1,R.raw.linkedin);
        likeAnimation(imagen2,R.raw.github);



    }


    public void url (View view){
        Uri uri = Uri.parse(url);
        Intent intentnav = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intentnav);

    }

    public void url1 (View view){
        Uri uri = Uri.parse(url1);
        Intent intentnav = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intentnav);
    }
    public void url2 (View view){
        Uri uri = Uri.parse(url2);
        Intent intentnav = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intentnav);
    }
    private void likeAnimation(LottieAnimationView imagenView, int animation){

        imagenView.setAnimation(animation);
        imagenView.playAnimation();



    }


}