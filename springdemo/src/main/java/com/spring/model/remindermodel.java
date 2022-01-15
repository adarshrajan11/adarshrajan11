package com.spring.model;


public class remindermodel {
    private String reminder;
    private String date;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public remindermodel(String reminder, String date) {
        this.reminder = reminder;
        this.date = date;
    }

    public String getReminder() {
        return this.reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }
   // private String itemName;
    
}
