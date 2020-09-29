package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "homework3.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "homework3.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        final EditText name = findViewById(R.id.editTextText1);
        final EditText job =  findViewById(R.id.editText2);
        final EditText phone =  findViewById(R.id.editText3);
        final EditText email =  findViewById(R.id.editText4);
        final EditText age =  findViewById(R.id.editText5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2 = name.getText().toString();
                String job2 = job.getText().toString();
                String email2 = email.getText().toString();
                String phone2 = phone.getText().toString();
                String age2 = age.getText().toString();
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name3",name2);
                intent.putExtra("job3",job2);
                intent.putExtra("email3",email2);
                intent.putExtra("phone3",phone2);
                intent.putExtra("age3",age2);
                startActivity(intent);



            }
        });

        }



}