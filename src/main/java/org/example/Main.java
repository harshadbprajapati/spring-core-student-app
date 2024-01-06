package org.example;


import org.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("spring-config.xml");
        Student student1 = (Student) appContext.getBean("btechStudentBean");
        Student student2 = (Student) appContext.getBean("bTechStudent");
        System.out.println(student1.getCurrentStatus());
        System.out.println(student2.getCurrentStatus());
    }
}

