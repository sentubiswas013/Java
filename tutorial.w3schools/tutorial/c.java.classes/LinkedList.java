public class LinkedList {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        java.util.LinkedList<String> cars = new java.util.LinkedList<>();
        cars.add("Tata");
        cars.add("OLA");
        cars.add("Mahindra");
        cars.add("Audi");
        cars.add("BMW");

        for(String i: cars) {
            System.out.println("Hello World :cls " + i);
        }

    }    
}
