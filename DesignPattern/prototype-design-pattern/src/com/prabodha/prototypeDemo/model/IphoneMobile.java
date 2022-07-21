package com.prabodha.prototypeDemo.model;

import com.prabodha.prototypeDemo.contract.PrototypeCapable;

public class IphoneMobile implements PrototypeCapable {
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public IphoneMobile clone() throws CloneNotSupportedException {
        System.out.println("Cloning Iphone object..");
        return (IphoneMobile) super.clone();
    }
    @Override
    public String toString() {
        return "Iphone";
    }
}
