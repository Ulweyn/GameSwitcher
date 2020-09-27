package com.example.gameswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BarleyBreak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barley_break);
        //Intent intent = this.getIntent();
        //((TextView)findViewById(R.id.textview21)).setText(intent.getStringExtra("name"));

    }
    TextView getCellByCoord(int i,int j){
      return  findViewById(getResources().getIdentifier("textView"+i+j,"id",getPackageName()));
    }
}