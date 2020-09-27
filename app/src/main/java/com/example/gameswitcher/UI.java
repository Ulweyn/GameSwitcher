package com.example.gameswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void BarleyBreak(View barleyBreak) {
        //Toast.makeText(this,"barleyBreak",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, BarleyBreak.class);
        intent.putExtra("name","G-15");
        startActivity(intent);
    }

}