package oneparameter;

interface Student {

    void setName(String name);
}

class RegularOneparameter implements Student {

    @Override
    public void setName(String name) {
        System.out.println("Hello" + " " + name);
    }

    public static void main(String args[]) {
        RegularOneparameter obj = new RegularOneparameter();
        obj.setName("Prabodha");
    }
}
