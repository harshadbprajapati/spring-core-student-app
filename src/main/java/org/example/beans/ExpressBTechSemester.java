package org.example.beans;

public class ExpressBTechSemester implements Semester{
    @Override
    public String getSemesterNo() {
        return "6, in express mode";
    }

    @Override
    public String getSubjects() {
        return "FSD, DAIE, LT, AOS, Project-1, DAPython, in express mode";
    }
}
