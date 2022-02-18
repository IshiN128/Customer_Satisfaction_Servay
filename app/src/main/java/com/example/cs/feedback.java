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

public class feedback extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    ImageButton  dn;
    ImageButton ignr;
    ImageButton AprtNo;
    private EditText aprtNo;

    private  String apartNo;


    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        dn = findViewById(R.id.btn_dn);
        ignr = findViewById(R.id.btn_ignore);
        AprtNo = findViewById(R.id.btn_AptNo);
        aprtNo = findViewById(R.id.txtbox_aptno);

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

//                Intent intent =new Intent(feedback.this,ApartmentNo.class);
//                startActivity(intent);
                apartNo = aprtNo.getText().toString();
                addDataToFirestore(apartNo);//adding data to database

            }
        });


        };
    private void addDataToFirestore(String apartNo) {

        CollectionReference dbaptno = db.collection("ApartmentNos");
        storeData ApartmentNos = new storeData(apartNo);

        dbaptno.add(ApartmentNos).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(feedback.this, "Your Apartment No has been added..", Toast.LENGTH_SHORT).show();
            }
        });

    }

}

