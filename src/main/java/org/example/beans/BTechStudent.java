package org.example.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BTechStudent implements Student{
    @Override
    public String getCurrentStatus() {
        return this+" is studying 6th semester";
    }
}

