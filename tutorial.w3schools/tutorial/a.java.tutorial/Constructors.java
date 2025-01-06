public class Constructors {
    String name;
    int age;
    
    public Constructors(String nm, int ag) {
        name = nm;
        age = ag;
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors("Sentu", 25);
        System.out.println(obj.name +" "+ obj.age);
    }
}
