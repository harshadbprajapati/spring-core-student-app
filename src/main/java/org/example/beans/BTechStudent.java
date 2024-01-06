package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BTechStudent implements Student{
    Semester studentSemester;
    @Autowired
    BTechStudent(Semester studentSemester){
        System.out.println("Constructor called");
        this.studentSemester = studentSemester;
    }

    @Autowired
    public void setStudentSemester(Semester studentSemester) {
        System.out.println("setStudentSemester called");
        this.studentSemester = studentSemester;
    }

    @Override
    public String getCurrentStatus() {
        return " is studying the following subjects: "+
                studentSemester.getSubjects()+" in semester "+
                studentSemester.getSemesterNo();
    }
}

