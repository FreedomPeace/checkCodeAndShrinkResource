package com.example.checkcodestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public final class MainActivity extends AppCompatActivity {
    private String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(a);
        final int count=10 ;
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }
        new Thread(){
           private int a = 0;
            @Override
            public void run() {
                super.run();

                while (a<count) {
                    System.out.println(a);
                    a++;
                }
                System.out.println("end");
            }
        }.start();
    }
}