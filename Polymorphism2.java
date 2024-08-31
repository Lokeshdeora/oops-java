//multilevel inheritance:constructor overlaoding
class A{
    A(int id){
        System.out.println("ID: "+id);
    }
    A(String name,long contact){
        System.out.println("Name: "+name);
        System.out.println("Contact: "+contact);
    }
}
class B extends A{
    B(int marks){
        super(30);
        System.out.println("Marks: "+marks);
    }
    B(String c){
        super("Lokesh Deora",123456789);
        System.out.println("Class: "+c);
    }
}
class C extends B{
    C(){
        super(500);
        System.out.println("Hello!...");
    }
    C(int roll){
        super("Bsc 3rd year");
        System.out.println("Roll No.: "+roll);
    }
}
public class Polymorphism2{
    public static void main(String[] args) {
       new C();
       new C(101);
    }
}