package com.login235.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView text, name, email, phone, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        text = findViewById(R.id.text);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);

        Bundle extras = getIntent().getExtras();
        if (true) {
            String n = extras.getString("key1"); // For Name
            name.setText("Name: "+n);
            String e = extras.getString("key2"); // For Email
            email.setText("Email: "+e);
            String p = extras.getString("key3"); // For Phone Number
            phone.setText("Phone: "+p);
            String a = extras.getString("key4"); // For Address
            address.setText("Address: "+a);
        }
    }
}
