package tutorial.com.example.tutorial;


// Instance Method
class CarInstance {
    int speed;

    // Instance method
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}

// Static Method
class MathUtility {

    // Static method
    static int add(int a, int b) {
        return a + b;
    }
}

// Abstract Method
abstract class AnimalAbs {
    // Abstract method (no body)
    abstract void sound();
}

class DogAbs extends AnimalAbs {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Woof");
    }
}


public class MethodTypes {
    public static void main(String[] args) {

        // Abstract Method
        AnimalAbs animalAbs = new DogAbs();
        animalAbs.sound();  // Calling abstract method (implementation is in Dog class)

        // Static Method
        int result = MathUtility.add(5, 3);  // Calling static method without creating an object
        System.out.println("Sum: " + result);

        // Instance Method
        CarInstance car = new CarInstance();
        car.setSpeed(100);  // Calling instance method
        car.displaySpeed();




    }
}
