package com.example.citizenjustice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Complaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);


        final Button el = (Button) findViewById(R.id.btn_elec);
        final Button ga = (Button) findViewById(R.id.btn_garbage);
        final Button pp = (Button) findViewById(R.id.btn_pubprop);
        final Button tr = (Button) findViewById(R.id.btn_traffic);
        final Button wa = (Button) findViewById(R.id.btn_water);
        final Button ot = (Button) findViewById(R.id.btn_others);

        el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchactivity = new Intent(Complaint.this, Electrical.class);
                startActivity(launchactivity);
            }
        });
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchactivity = new Intent(Complaint.this, Electrical.class);
                startActivity(launchactivity);
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchactivity = new Intent(Complaint.this, Electrical.class);
                startActivity(launchactivity);
            }
        });
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchactivity = new Intent(Complaint.this, Electrical.class);
                startActivity(launchactivity);
            }
        });
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchactivity = new Intent(Complaint.this, Electrical.class);
                startActivity(launchactivity);
            }
        });
        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchactivity = new Intent(Complaint.this, Electrical.class);
                startActivity(launchactivity);
            }
        });

    }
}