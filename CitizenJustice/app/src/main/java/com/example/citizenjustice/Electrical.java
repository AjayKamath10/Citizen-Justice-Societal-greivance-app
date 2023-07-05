package com.example.citizenjustice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import android.Manifest;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.LocationRequest;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.IOException;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Electrical extends AppCompatActivity {

    FirebaseFirestore firestore;
    final String[] inp_location = new String[1];
    private LocationRequest locationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LocationGetter();




        setContentView(R.layout.activity_electrical);

        final Button submit = (Button) findViewById(R.id.btn_submit);

        /*
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ActivityCompat.checkSelfPermission(, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_DENIED) {
                        requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.SEND_SMS, Manifest.permission.READ_CONTACTS}, 100);
                    }
                }*/

        // this is a special permission required only by devices using
        // Android Q and above. The Access Background Permission is responsible
        // for populating the dialog with "ALLOW ALL THE TIME" option


        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText title = (EditText) findViewById(R.id.text_title);
                EditText descr = (EditText) findViewById(R.id.text_desc);

                String inp_title = title.getText().toString();
                String inp_desc = descr.getText().toString();
                firestore = FirebaseFirestore.getInstance();

                Map<String, Object> user = new HashMap<>();
                user.put("Title", inp_title);
                user.put("Description", inp_desc);
                //user.put("Location", "https://goo.gl/maps/M8s4KbGf6R3kSmM58");
                user.put("Location", "https://www.google.com/maps/place/Lab+Block+BMSIT/@13.1345192,77.5678658,20.83z/data=!4m6!3m5!1s0x3bae19121d541f73:0xd22f63436097990f!8m2!3d13.1343663!4d77.5681238!16s%2Fg%2F11stqk00mp?entry=ttu");

                firestore.collection("users").add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Failure", Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
    }






}