package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BTechStudent implements Student{
    Semester studentSemester;

    public BTechStudent() {
        System.out.println("Constructor BTechStudent() called");
    }

    @Autowired
    void setStudentSemester(@Qualifier("expressBTechSemester") Semester studentSemester){
        System.out.println("setStudentSemester() called");
        this.studentSemester = studentSemester;
    }

    @Override
    public String getCurrentStatus() {
        return " is studying the following subjects: "+
                studentSemester.getSubjects()+" in semester "+
                studentSemester.getSemesterNo();
    }
}

