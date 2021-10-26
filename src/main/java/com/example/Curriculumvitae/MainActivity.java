package com.example.Curriculumvitae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, MainActivity2.class);
        startActivity(siguiente);
        this.overridePendingTransition(R.anim.from_r,R.anim.to_left);

    }


    public void Siguiente2(View view){
        Intent siguiente2 = new Intent(this, MainActivity3.class);
        startActivity(siguiente2);
        this.overridePendingTransition(R.anim.from_l,R.anim.to_right);
    }
}