public class HashMap {
    public static void main(String[] args) {
        // System.out.println("HashMap");
        java.util.HashMap<String, String> countries = new java.util.HashMap<String, String>();
        countries.put("Bharat", "Delhi");
        countries.put("USA", "Washinton");
        countries.put("China", "Bejing");
        countries.put("England", "London");

        // System.out.println(countries);
        // System.out.println(countries.get("Bharat"));
        // System.out.println(countries.remove("England"));
        // System.out.println(countries.size());
        // System.out.println(countries.toString());

        // for(String i: countries.keySet()){
        //     System.out.println("Hello: " + i);
        // }

        // for(String i: countries.values()){
        //     System.out.println("Hello: " + i);
        // }

        for(String i: countries.keySet()){
            System.out.println("Hello: " + countries.get(i));
        }
    }
}
