// package tutorial.c.java.classes;

public class Encapsulation {
    public static void main(String[] args) {
        // System.out.println("Hello");

        Person obj = new Person();
        // obj.name ="Pintu Biswas";
        // System.out.println(obj.name);

        obj.setName("Joshn");
        System.out.println(obj.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
