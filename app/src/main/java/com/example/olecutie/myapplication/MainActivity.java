package com.example.olecutie.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add Fragmant to Activity
        getSupportFragmentManager().beginTransaction().add(R.id.layoutMainFragmant,new MainFragment()).commit();





    }//Main Method
}//Main Class
