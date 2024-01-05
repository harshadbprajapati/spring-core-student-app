package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BTechStudent implements Student{
    @Override
    public String getCurrentStatus() {
        return this+" is studying 6th semester";
    }
}

