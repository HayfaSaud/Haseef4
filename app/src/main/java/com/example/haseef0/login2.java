package com.example.haseef0;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().hide();//يشيل البار الي فوق
        Button b = (Button) findViewById(R.id.loginbutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecondActivity();
            }
        });
    }
        private void goToSecondActivity(){
            Intent intent =new Intent (this, HomeStaff.class);
            startActivity(intent);
        }
    }//
