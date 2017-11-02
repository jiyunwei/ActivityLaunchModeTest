package com.example.administrator.activitylaunchmodetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private Button first,second,main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        first= (Button) findViewById(R.id.first);
        second= (Button) findViewById(R.id.second);
        main= (Button) findViewById(R.id.main);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        main.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.first:
                intent=new Intent(this,FirstActivity.class);
                startActivity(intent);
                break;
            case R.id.second:
                intent=new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.main:
                intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}
