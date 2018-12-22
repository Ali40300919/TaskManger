package com.example.admin.software_1.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 12/22/2018.
 */

public class TaskLab {


    private static final TaskLab instance =new TaskLab();


    private List<Task> mAllTasks=new ArrayList<>();
    private List<Task> mDoneTasks=new ArrayList<>();
    private List<Task>mUnDonetasks=new ArrayList<>();




    public static TaskLab getInstance() {
        return instance;
    }

    public void addTask(Task task)
    {
        //Add task with every Type mAllTasks List
        mAllTasks.add(task);



       //Add task according to the Type in their List
        switch (task.getType())
        {
            case DONE:
                mDoneTasks.add(task);
                break;
            case UNDONE:
                mUnDonetasks.add(task);
                break;
        }
    }

    public List<Task> getTaskList(Task.TaskType type) throws IllegalArgumentException
    {

        switch (type)
        {
            case ALL:
                return mAllTasks;
            case DONE:
                return mDoneTasks;
            case UNDONE:
                return mUnDonetasks;

            default:
                    throw new IllegalArgumentException("The Type is Type.All, Type.DONE and Type.UNDONE");

        }

    }






}

