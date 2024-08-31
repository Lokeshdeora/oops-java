//Can we overload java main() method? 

public class Polymorphism5 {
    public static void main(int id) {
        System.out.println("ID: "+id);
    }
    public static void main(String name) {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Polymorphism5 o = new Polymorphism5();
        o.main(200);
        o.main("Loks");
    }
}
//=> Yes , We can Overload main() method with different Parameters
