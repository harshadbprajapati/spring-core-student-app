package org.example;

import org.example.beans.Student;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student1 = appContext.getBean(Student.class);
        System.out.println(student1.getCurrentStatus());
    }
}

