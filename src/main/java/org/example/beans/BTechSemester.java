package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BTechSemester implements Semester{
    @Override
    public String getSemesterNo() {
        return "6";
    }

    @Override
    public String getSubjects() {
        return "FSD, DAIE, LT, AOS, Project-1, DAPython";
    }
}

