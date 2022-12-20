package org.yadav.recyclerviewdummy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        List<Contact> contacts;
        contacts = initData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ContactAdapter contactAdapter = new ContactAdapter(this, contacts);
        recyclerView.setAdapter(contactAdapter);
    }

    private List<Contact> initData() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("9324029051", "Sahil Yadav"));
        return contacts;
    }


}