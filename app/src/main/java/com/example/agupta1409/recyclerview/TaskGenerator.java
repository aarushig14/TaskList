package com.example.agupta1409.recyclerview;

import java.util.ArrayList;

/**
 * Created by a.gupta1409 on 25-03-2017.
 */

public class TaskGenerator {
    ArrayList<Task> tasklist;

    public TaskGenerator() {
            tasklist = new ArrayList<>();
    }

    private Task getTask(){
        Task t = new Task("Do your Work");
        return t;
    }

    public ArrayList<Task> getTasklist(int n){
        for(int i=0;i<n;i++) {
            tasklist.add(i,this.getTask());
        }
        return tasklist;
    }

}
