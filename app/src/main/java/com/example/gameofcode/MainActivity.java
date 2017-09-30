package com.example.gameofcode;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView charactersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Character> characters = new ArrayList<>();
        characters.add(new Character("Jon Snow", "Stark", "mężczyzna",
                true, "jon_snow", null));
        characters.add(new Character("Arya Stark", "Stark", "kobieta",
                true, "arya_stark", null));
        characters.add(new Character("Cersei Lannister", "Lannister", "kobieta",
                true, "cersei_lannister", null));

        charactersListView = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<Character> adapter = new ArrayAdapter<Character>
                (this, R.layout.character_row, characters) {
            @NonNull
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                    convertView = LayoutInflater.from(MainActivity.this)
                            .inflate(R.layout.character_row, parent, false);
                TextView name = (TextView) convertView.findViewById(R.id.row_textView);
                name.setText(characters.get(position).name);
                return convertView;
            }
        };


        charactersListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
