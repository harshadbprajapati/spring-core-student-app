package org.example.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BTechSemester implements Semester{
    public BTechSemester() {
        System.out.println("Constructor BTechSemester() called");
    }

    @PostConstruct
    public void doInitialization(){
        System.out.println("BTechSemester.doInitialization()");
    }

    @PreDestroy
    public void doCleanup(){
        System.out.println("BTechSemester.doCleanup()");
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

