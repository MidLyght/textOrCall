package com.example.callortext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    private Button btnCall,btnSend;
    private EditText etPhone1,etPhone2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btnCall=findViewById(R.id.btnCallNew);
        btnSend=findViewById(R.id.btnTextNew);
        etPhone1=findViewById(R.id.etPhone1New);
        etPhone2=findViewById(R.id.etPhone2New);
    }

    public void sendText(View view){
        String no=etPhone1.getText().toString();
        Intent intent=new Intent(getApplicationContext(),NewActivity.class);
        PendingIntent pi= PendingIntent.getActivity(getApplicationContext(), 0, intent,0);
        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(no, null, "Hi!", pi,null);
        Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                Toast.LENGTH_LONG).show();
    }

    public void callPhone(View view){
        String no=etPhone2.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse(no));
        startActivity(callIntent);
    }
}