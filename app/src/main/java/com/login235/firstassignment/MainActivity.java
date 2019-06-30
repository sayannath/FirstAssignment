package com.login235.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, email, phone, address, password;
    Button signup;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Defining the edit Text
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        password = findViewById(R.id.password);

        //Defining the Button Part
        signup = findViewById(R.id.signup);

        //Defining the Image View
        image1 = findViewById(R.id.image1);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString(); // n is for Name
                String e = email.getText().toString(); // e is for Email
                String p = phone.getText().toString(); // p is for Phone
                String a = address.getText().toString(); // a is for address

                //Navigating to the other Page
                Intent gthp = new Intent(MainActivity.this, Home.class);
                gthp.putExtra("key1", n);
                gthp.putExtra("key2", e);
                gthp.putExtra("key3", p);
                gthp.putExtra("key4", a);
                startActivity(gthp);
                Toast.makeText(MainActivity.this, "Signing in as\n"+n+"", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
