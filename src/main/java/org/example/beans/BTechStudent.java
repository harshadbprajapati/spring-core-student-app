package org.example.beans;


public class BTechStudent implements Student{
    @Override
    public String getCurrentStatus() {
        return this+" is studying 6th semester";
    }
}

