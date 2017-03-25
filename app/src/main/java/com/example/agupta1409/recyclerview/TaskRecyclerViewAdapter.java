package com.example.agupta1409.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a.gupta1409 on 19-03-2017.
 */

public class TaskRecyclerViewAdapter extends RecyclerView.Adapter {

    Context ctx;
    ArrayList<Task> taskArrayList;

    public TaskRecyclerViewAdapter(ArrayList<Task> taskArrayList, Context ctx) {
        this.taskArrayList = taskArrayList;
        this.ctx = ctx;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.task_list,parent);
        Holder h= new Holder(v);
        h.tv = (TextView) v.findViewById(R.id.tv_task);
        return h;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView tv;

        public Holder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_task);
        }
    }

}
