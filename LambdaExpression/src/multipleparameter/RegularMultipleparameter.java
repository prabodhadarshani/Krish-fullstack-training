package multipleparameter;

interface Student {

    void print(String name, int age);
}

class RegularMultipleparameter implements Student {

    @Override
    public void print(String name, int age) {
        System.out.println("Hello" + " " + name + " " + age);
    }

    public static void main(String args[]) {
        RegularMultipleparameter obj = new RegularMultipleparameter();
        obj.print("Prabodha", 25);
    }
}
