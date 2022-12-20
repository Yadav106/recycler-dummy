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
        contacts.add(new Contact("1275838494", "Hari Puttar"));
        contacts.add(new Contact("9583859394", "Dumbles Door"));
        contacts.add(new Contact("4839858494", "Free Elf Dhobi"));
        contacts.add(new Contact("9349583843", "Her My Knee"));
        contacts.add(new Contact("8459848582", "Ronald Duck"));
        contacts.add(new Contact("8395939493", "Zoro"));
        contacts.add(new Contact("4829385834", "Long Bottom"));
        contacts.add(new Contact("7349395835", "Luna Fish"));
        contacts.add(new Contact("4839593858", "No Nose November"));
        contacts.add(new Contact("4892835829", "Siriusly Black"));
        contacts.add(new Contact("9693858384", "Dolores Cambridge"));
        contacts.add(new Contact("2949593959", "Pottahhhh"));
        contacts.add(new Contact("9385734783", "Victor Krumbles"));

        return contacts;
    }


}