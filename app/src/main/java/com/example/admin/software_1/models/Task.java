package com.example.admin.software_1.models;

import java.util.Date;

/**
 * Created by ADMIN on 12/22/2018.
 */

public class Task {



    private String mTitle;
    private String mDescription;
    private Date mDate;
    private Date mHour;
    private TaskType type;

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Date getHour() {
        return mHour;
    }

    public void setHour(Date hour) {
        mHour = hour;
    }


    public  enum  TaskType
    {
        ALL,
        DONE,
        UNDONE
    }


}

