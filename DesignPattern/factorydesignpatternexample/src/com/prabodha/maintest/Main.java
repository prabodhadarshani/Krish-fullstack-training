package com.prabodha.maintest;

import com.prabodha.design.factory.AnimalFactory;
import com.prabodha.design.model.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("working code");
               Animal Dog = AnimalFactory.getAnimal("Dog","brustro","black and white","chicken");
              Animal Cat= AnimalFactory.getAnimal("Cat","Kity","white","milk");
                 System.out.println("Factory Dog Config::"+Dog);
                 System.out.println("Factory cat Config::"+ Cat);
    }
}
