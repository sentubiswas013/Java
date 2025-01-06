

public class ArrayList {
    public static void main(String[] args) {
        System.out.println("Hello World");
        java.util.ArrayList<String> cars = new java.util.ArrayList<String>();
        cars.add("TATA");
        cars.add("Mahinda");
        cars.add("Toyoto");
        cars.add("Audi");
        cars.add("BMW");

        // System.out.println("Hello world: " + cars.remove(4) + "===" + cars.size() + "===" + cars.get(3) + "===" + cars.set(2, "Hello") );
        java.util.Collections.sort(cars);
        for(String i: cars) {
            System.out.println("Hello world: " + cars.size() + " === " + i);
        }
        
    }
}
