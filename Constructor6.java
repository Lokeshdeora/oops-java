//want to print instance variable value through refrence variable
class A{
    int a = 10;
}
class B extends A{
    int a = 50;
}
public class Constructor6 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a);
    }
}
