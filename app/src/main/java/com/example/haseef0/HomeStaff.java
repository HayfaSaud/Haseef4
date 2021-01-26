package com.example.haseef0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_staff);
        Button b = (Button) findViewById(R.id.Restockbutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecondActivity();
            }
        });
    }
    private void goToSecondActivity(){
        Intent intent =new Intent (this, restock.class);
        startActivity(intent);
    }
}

