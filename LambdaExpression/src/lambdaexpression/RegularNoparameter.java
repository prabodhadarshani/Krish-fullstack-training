package lambdaexpression;

/**
 * @param args the command line arguments
 */
interface Student {

    void print();
}

class RegularNoparameter implements Student {

    @Override
    public void print() {
        System.out.println("I am Prabodha");

    }

    public static void main(String[] args) {
        RegularNoparameter obj = new RegularNoparameter();
        obj.print();
    }

}
