package multipleparameter;

@FunctionalInterface  //It is optional  
interface StudentOne {

    public void print(String name, int age);
}

public class LambdaMultipleparameter {

    public static void main(String[] args) {

        //with lambda  
        StudentOne obj = (name, age) -> {
            System.out.println("Hello" + " " + name + " " + age);
        };
        obj.print("Prabodha", 25);
    }
}
