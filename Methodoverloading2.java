//hierarchal inheritance :parameterised constructor
class A{
    A(int a){
        System.out.println("Class A Constructor: "+a);
    }
}
class B extends A{
    B(int a){
        super(20);
        System.out.println("Class B Constructor: "+a);
    }
}
class C extends A{
    C(int a){
        super(20);
        System.out.println("Class C Constructor: "+a);
    }
}
public class Methodoverloading2{
    public static void main(String[] args) {
        new B(5);
        new C(30);
        
   }
}

