package com.prabodha.builderpedesignpattern;

import com.probodha.BuilderDemo.Builder.Mobile;

public class Main {

    public static void main(String[] args) {
	// write your code here

         Mobile mob = new Mobile.Builder("Redmi K50i", "Nokia 5.4", "Apple 11").build();

        Mobile mob1 = new Mobile.Builder("Redmi K50i", "Nokia 5.4", "Apple 11").setGraphicsCardEnabled(true).build();
    }
}
