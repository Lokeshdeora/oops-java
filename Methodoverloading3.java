//hybrid inheritance ::parameterised constructor
class A{
    A(int a){
        System.out.println("Class A Constructor: "+a);
    }
}
class B {
    B(int a){
        System.out.println("Class B Constructor: "+a);
    }
}
class C extends A,B{
    C(int a){
        super(10);
        System.out.println("Class C Constructor: "+a);
    }
}
class D extends C{
    D(int a){
        super(20);
    }
}
public class Methodoverloading3 {
    public static void main(String[] args) {
        new D(50);
   }
}
//Methodoverloading3.java:12: error: '{' expected
//class C extends A,B{
   // ^
//1 error