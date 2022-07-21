package com.prabodha.prototypeDemo.contract;

public interface PrototypeCapable extends Cloneable
{
    public PrototypeCapable clone() throws CloneNotSupportedException;
}