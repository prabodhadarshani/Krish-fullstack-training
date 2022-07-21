package com.prabodha.prototypeDemo.model;

import com.prabodha.prototypeDemo.contract.PrototypeCapable;

public class AndroidMobile implements PrototypeCapable {
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public AndroidMobile clone() throws CloneNotSupportedException {
        System.out.println("Cloning Android object..");
        return (AndroidMobile) super.clone();
    }
    @Override
    public String toString() {
        return "AndroidMobile";
    }
}
