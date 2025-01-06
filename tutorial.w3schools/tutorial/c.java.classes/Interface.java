public class Interface {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Pig objPig = new Pig();
        objPig.animalSound();
        objPig.sleep();
    }
}

interface Animal  {
    public void animalSound();
    public void sleep();  
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("The sleep says: zzzz");
    }
}

