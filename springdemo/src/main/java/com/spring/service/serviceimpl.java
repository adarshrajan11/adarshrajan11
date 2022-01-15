package com.spring.service;

import java.util.List;

import com.spring.model.remindermodel;
import com.spring.repository.reminderrepo;

public class serviceimpl implements reminderservice {
    private reminderrepo reminder;

    public serviceimpl(reminderrepo reminder) {
        this.reminder = reminder;
    }

    
    @Override
    public void list(List<remindermodel> items) {
        // TODO Auto-generated method stub

         
        for (remindermodel i : items) {
            System.out.println(i.getReminder() + "" + i.getDate());
           }

       
    }


    
    
}
