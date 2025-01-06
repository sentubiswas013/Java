
public class Abstraction {
    public static void main(String[] args){
        Pig objPig = new Pig();
        objPig.animalSound();
        objPig.sleep();
    }
}

abstract  class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Sleep");
    }    
}

class Pig extends Animal  {
    public void  animalSound() {
        System.out.println("The pig says: wee we");
    }    
}