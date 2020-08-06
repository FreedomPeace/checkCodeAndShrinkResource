package com.example.checkcodestyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class MainActivity extends AppCompatActivity {
    private String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(a);
        Bundle bundle = new Bundle();
        bundle.putInt("dd",3);
        final int count=10 ;
        for (int i = 0; i < count; i++) {
            Logger.getAnonymousLogger().log(Level.INFO,i+"");
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
                Logger.getLogger("pp").logp(Level.INFO,this.getClass().getCanonicalName(),
                        "run","end");
            }
        }.start();
        boolean is = getIsPerson(6);
        int anInt = new DeclaredClass().getInt();
        Toast.makeText(this, "DEBUG = "+BuildConfig.DEBUG+is+"int:"+anInt, Toast.LENGTH_SHORT).show();
    }

    private boolean getIsPerson(int age) {
        boolean is = age >0;
        return true;
    }

    public void toast(View view) {
        int anInt = new DeclaredClass().getInt();
        Toast.makeText(this, "DEBUG = "+BuildConfig.DEBUG+"int:"+anInt, Toast.LENGTH_SHORT).show();

    }
}