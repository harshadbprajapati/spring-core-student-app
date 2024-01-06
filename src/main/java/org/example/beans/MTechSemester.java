package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MTechSemester implements Semester{
    @Override
    public String getSemesterNo() {
        return "4";
    }

    @Override
    public String getSubjects() {
        return "Dissertation";
    }
}
