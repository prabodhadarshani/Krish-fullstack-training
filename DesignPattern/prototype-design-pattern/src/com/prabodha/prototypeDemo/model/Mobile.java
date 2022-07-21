package com.prabodha.prototypeDemo.model;

import com.prabodha.prototypeDemo.contract.PrototypeCapable;

public class Mobile implements PrototypeCapable {
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Mobile clone() throws CloneNotSupportedException {
        System.out.println("Cloning Moible object..");
        return (Mobile) super.clone();
    }
    @Override
    public String toString() {
        return "Mobile";
    }

}
