package com.example.cs;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class feedback3 extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    ImageButton  dn;
    Button AprtNo;
    private EditText aprtNo;

    private  String apartNo;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback4);

        dn = findViewById(R.id.btn_dn);
        AprtNo = findViewById(R.id.btn_AptNo);
        aprtNo = findViewById(R.id.txtbox_aptno);



        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.equals(dn)) {
                    Intent intent = new Intent(feedback3.this, MainActivity.class);
                    startActivity(intent);

                    Map<String, Object> test = new HashMap<>();
                    test.put("Response", "Poor");
                    db.collection("ApartmentNos").add(test);

                    Toast.makeText(feedback3.this, "Your Feedback has been send!!", Toast.LENGTH_SHORT).show();
                }
            }


        });



        AprtNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent =new Intent(feedback.this,ApartmentNo.class);
//                startActivity(intent);
                apartNo = aprtNo.getText().toString();
                addDataToFirestore(apartNo);//adding data to database

                Intent intent = new Intent(feedback3.this, MainActivity.class);
                startActivity(intent);

            }
        });



    };
    private void addDataToFirestore(String apartNo) {

        CollectionReference dbaptno = db.collection("ApartmentNos");
        storeData3 ApartmentNos = new storeData3(apartNo);

        dbaptno.add(ApartmentNos).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(feedback3.this, "Your Apartment No has been added..", Toast.LENGTH_SHORT).show();
            }
        });

    }

}

