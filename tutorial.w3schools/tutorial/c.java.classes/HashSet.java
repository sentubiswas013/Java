public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> cars = new java.util.HashSet<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("TATA");
        cars.add("Mahindra");
        cars.add("Renault");
        
        System.out.println("HashMap: " + cars.add("Hello"));
        System.out.println("HashMap: " + cars.size());
        // System.out.println("HashMap: " + cars.remove("Hello"));
        System.out.println("HashMap: " + cars.contains("Hello"));
        System.out.println("HashMap: " + cars.contains("Hello"));

        for(String i: cars){
            System.out.println("Hello: "+ i);
        }
    }
}
