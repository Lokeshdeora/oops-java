//single level inheritance :parameterised constructor
class A{
    A(int a,int b){
        System.out.println("Add: "+(a+b));
    }
}
class B extends A{
    B(int a,int b){
        super(50, 40);
        System.out.println("Multiply: "+(a*b));
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        new B(36, 2);
        
   }
}