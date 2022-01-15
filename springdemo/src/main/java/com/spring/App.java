package com.spring;


import java.io.IOException;


import com.spring.controller.Remindercontroller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Remindercontroller obj = (Remindercontroller) context.getBean("remindcontroller");
       obj.getList();
    
           }
        }