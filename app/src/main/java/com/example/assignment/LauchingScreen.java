package com.example.assignment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class LauchingScreen extends AppCompatActivity {
Thread thread;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lauching_screen);
        thread = new Thread(){
            @Override
            public void run() {
                super.run();
                int waited = 0;
                while (waited <2000){
                    try {
                        sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    waited+=100;
                }
                Intent intent = new Intent(LauchingScreen.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                finish();
            }
        };
            thread.start();
        }
    }

