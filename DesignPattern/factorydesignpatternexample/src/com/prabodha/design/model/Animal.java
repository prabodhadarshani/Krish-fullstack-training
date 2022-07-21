package com.prabodha.design.model;


public abstract class Animal {


    public abstract String getName();
    public abstract String getColor();
    public abstract String getFood();

    @Override
    public String toString(){
        return "name= "+this.getName()+", color="+this.getColor()+", food="+this.getFood();
    }
}