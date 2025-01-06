public class Inheritance extends Cars {
    private String modelName = "Mustang ";    // Car attribute
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        Cars carObj = new Cars();

        obj.details();
        carObj.details();

        System.out.println("obj ------- " + obj.name + obj.modelName);
        System.out.println("carObj ---- " + carObj.name);
    }
}

class Cars  {
    protected String name = "Ford " ;
    public void details() {
        System.out.println("Car details...");
    }    
}


