package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BTechStudent implements Student{
    Semester studentSemester;
    @Autowired
    BTechStudent(Semester studentSemester){
        this.studentSemester = studentSemester;
    }
    @Override
    public String getCurrentStatus() {
        return " is studying the following subjects: "+
                studentSemester.getSubjects()+" in semester "+
                studentSemester.getSemesterNo();
    }
}

