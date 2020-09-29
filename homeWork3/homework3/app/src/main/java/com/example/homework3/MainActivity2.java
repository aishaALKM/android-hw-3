package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name = findViewById(R.id.nameTextView);
        TextView job = findViewById(R.id.jobTextView);
        TextView number = findViewById(R.id.numberTextView);
        TextView email = findViewById(R.id.emailTextView);
        TextView age = findViewById(R.id.ageTextView);

        Bundle aisha=getIntent().getExtras();
        String sara = aisha.getString("name3");
        String ran = aisha.getString("email3");
        String ra = aisha.getString("phone3");
        String anne = aisha.getString("age3");
        String nam = aisha.getString("job3");

        name.setText(sara);
        job.setText(nam);
        number.setText(ra);
        email.setText(ran);
        age.setText(anne);

    }
}