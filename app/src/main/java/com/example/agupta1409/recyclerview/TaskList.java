package com.example.agupta1409.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class TaskList extends AppCompatActivity {

    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_list);

        list = (RecyclerView) findViewById(R.id.task_list);
        list.setAdapter(new TaskRecyclerViewAdapter());


    }

}
