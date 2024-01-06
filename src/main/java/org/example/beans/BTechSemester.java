package org.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BTechSemester implements Semester{
    public BTechSemester() {
        System.out.println("Constructor BTechSemester() called");
    }

    @Override
    public String getSemesterNo() {
        return "6";
    }

    @Override
    public String getSubjects() {
        return "FSD, DAIE, LT, AOS, Project-1, DAPython";
    }
}

