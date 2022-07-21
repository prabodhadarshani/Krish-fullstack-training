package com.prabodha.design.model;


public class Dog extends Animal {

    private String name;
    private String color;
    private String food;

        public Dog(String name, String color, String food){
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