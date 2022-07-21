package com.probodha.BuilderDemo.Builder;

public class MobileBuilder {
    public Mobile getBasicComputer() {
        return new Mobile.Builder("Redmi K50i", "Nokia 5.4", "Apple 11").build();
    }

    public Mobile getGraphicsCardEnabledComputer() {
        return new Mobile.Builder("Redmi K50i", "Nokia 5.4", "Apple 11").setGraphicsCardEnabled(true).build();
    }
}
