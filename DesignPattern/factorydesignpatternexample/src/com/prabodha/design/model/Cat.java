package com.prabodha.design.model;

public class Cat extends Animal{
    private String name;
    private String color;
    private String food;

    public Cat(String name, String color, String food){
        this.name=name;
        this.color=color;
        this.food=food;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getName() {
        return name;
    }

}
