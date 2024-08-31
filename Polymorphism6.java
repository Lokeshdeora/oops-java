//want to print instance variable value through refrence variable
class A{
    int a = 30;
}
class B extends A{
    int a = 40;
}
public class Polymorphism6 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a);
    }
}
