public class Iterator {
    public static void main(String[] args) {
        java.util.ArrayList<String> cars= new java.util.ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Porche");
        cars.add("TATA");
        cars.add("OLA");

        java.util.Iterator<String> item = cars.iterator();
        // java.util.Iterator<String> item = cars.iterator();
       //  System.out.println(item.next());
        while (item.hasNext()) {
            System.out.println(item.next());
        }
       
    }
}
