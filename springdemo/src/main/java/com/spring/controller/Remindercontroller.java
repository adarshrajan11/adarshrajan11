package com.spring.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.spring.model.remindermodel;
import com.spring.repository.repoimpl;
import com.spring.service.reminderservice;
import com.spring.service.serviceimpl;

import org.springframework.stereotype.Component;

@Component
public class Remindercontroller {

    public void getList() {
        reminderservice service = new serviceimpl(new repoimpl());

        char response = 'o';
        List<remindermodel> items = new ArrayList<>();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        do {

            try {
                System.out.println("Enter Your Reminder:");
                String reminder = System.console().readLine();
                System.out.println("Enter Date:");
                String date = (System.console().readLine());

                System.out.print("Continue? [y/n]: ");
                response = input.readLine().charAt(0);

                items.add(new remindermodel(reminder, date));
            } catch (IOException e) {
                System.out.println(e);
            }
        } while (response != 'n');
        service.list(items);

    }

}
