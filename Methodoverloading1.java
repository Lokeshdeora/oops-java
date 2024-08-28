//multilevel inheritance :parameterised constructor
class A{
    A(int a,int b){
        System.out.println("Add: "+(a+b));
    }
}
class B extends A{
    B(int a,int b){
        super(30, 60);
        System.out.println("Sub: "+(a-b));
    }
}
class C extends B{
    C(int a,int b){
        super(3,15);
        System.out.println("Multiply: "+(a*b));
    }
}
class D extends C{
    D(int a,int b){
        super(15,5);
        System.out.println("Divide: "+(a/b));
    }
}
public class Methodoverloading1 {
    public static void main(String[] args) {
        new D(50, 25);
        
   }
}