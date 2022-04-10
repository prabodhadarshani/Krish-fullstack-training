package lambdaexpression;

@FunctionalInterface  //It is optional  

interface StudentOne {

    public void setName();
}

public class LambdaNoparameter {

    public static void main(String[] args) {
        //with lambda  
        StudentOne obj = () -> {
            System.out.println("I am Prabodha");
        };
        obj.setName();
    }
}
