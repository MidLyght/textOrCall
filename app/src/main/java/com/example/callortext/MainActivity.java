package com.example.callortext;

import androidx.appcompat.app.AppCompatActivity;

import android.telephony.SmsManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goNew=findViewById(R.id.btnGoNewMain);
    }

    public void GoToNew(View view){
        Intent switchActivityIntent = new Intent(this, NewActivity.class);
        startActivity(switchActivityIntent);
    }
}