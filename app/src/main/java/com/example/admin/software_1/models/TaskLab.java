package com.example.admin.software_1.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 12/22/2018.
 */

public class TaskLab {


    private static final TaskLab instance =new TaskLab();


    private List<Task> mTasks=new ArrayList<>();

    public static TaskLab getInstance() {
        return instance;
    }

    public void addTask(Task task)
    {
        mTasks.add(task);
    }

    public List<Task> getTaskList()
    {
        return mTasks;
    }
}

