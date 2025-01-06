public class Polymorphism {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Animal objAnimal = new Animal();
        Animal objPig = new Pig();
        Animal objDog = new Dog();

        objAnimal.animalSound();
        objPig.animalSound();
        objDog.animalSound();
    }
}

class Animal  {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal  {
    public void animalSound() {
        System.out.println("The Pig says: bow wow");
    }   
    
}

class Dog extends Animal  {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }   
    
}
