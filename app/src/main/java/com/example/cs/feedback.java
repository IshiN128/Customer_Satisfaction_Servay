package com.example.cs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class feedback extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    ImageButton  dn;
    ImageButton ignr;
    ImageButton AprtNo;


    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        dn = findViewById(R.id.btn_dn);
        ignr = findViewById(R.id.btn_ignore);
        AprtNo = findViewById(R.id.btn_AptNo);

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(feedback.this,MainActivity.class);
                startActivity(intent);

            }
        });

        AprtNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(feedback.this,ApartmentNo.class);
                startActivity(intent);

            }
        });


        };


}