package com.prabodha.design.factory;

import com.prabodha.design.model.Animal;
import com.prabodha.design.model.Cat;
import com.prabodha.design.model.Dog;

public class AnimalFactory {
    public static Animal getAnimal(String type, String name, String color, String food){
        if("Dog".equalsIgnoreCase(type)) return new Dog(name, color, food);
        else if("Cat".equalsIgnoreCase(type)) return new Cat(name, color, food);

        return null;
    }
}