//Can we overload java main() method? 
public class Constructor5 {
    public static void main(int id) {
        System.out.println("ID: "+id);
    }
    public static void main(String name) {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Constructor5 o = new Constructor5();
        o.main(100);
        o.main("Loks");
    }
}
