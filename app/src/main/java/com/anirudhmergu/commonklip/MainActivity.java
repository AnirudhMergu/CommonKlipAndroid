package com.anirudhmergu.commonklip;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ClipboardItem> list;

    ImageView regenerate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        list = new ArrayList<>();
        list.add(new ClipboardItem("Hello Anirudh1", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh2", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh3", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh4", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh5", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh6", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh7", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh8", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh9", "2 secs ago", "Temp", "text"));
        list.add(new ClipboardItem("Hello Anirudh0", "2 secs ago", "Temp", "text"));

        RecyclerView recyclerView = findViewById(R.id.recycler_clipboard_view);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(myAdapter);

        regenerate_btn = findViewById(R.id.regenerate_password_btn);
    }

    public void regeneratePassword(View v) {

    }
}
