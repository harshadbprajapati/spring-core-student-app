package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BTechStudent implements Student{
    Semester studentSemester;

    public BTechStudent() {
        System.out.println("Constructor BTechStudent() called");
    }
    @PostConstruct
    public void doInitialization(){
        System.out.println("BTechStudent.doInitialization()");
    }

    @PreDestroy
    public void doCleanup(){
        System.out.println("BTechStudent.doCleanup()");
    }

    @Autowired
    void setStudentSemester(@Qualifier("BTechSemester") Semester studentSemester){
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

