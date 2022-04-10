/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneparameter;

@FunctionalInterface  //It is optional  
interface StudentOne {

    public void SetName(String name);
}

public class LambdaOneparameter {

    public static void main(String[] args) {

        //with lambda  
        StudentOne obj = (name) -> {
            System.out.println("Hello" + " " + name);
        };
        obj.SetName("Prabodha");
    }
}
