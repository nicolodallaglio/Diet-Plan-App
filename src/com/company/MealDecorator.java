package com.company;

public class MealDecorator {
    private String nameDecorator;

    public MealDecorator(String nameDecorator) {
        this.nameDecorator = nameDecorator;
    }

    public String getNameDecorator() {
        return nameDecorator;
    }

    public void setNameDecorator(String nameDecorator) {
        this.nameDecorator = nameDecorator;
    }
}
