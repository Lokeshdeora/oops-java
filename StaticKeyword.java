//static instance variable 
//	5 constructor call
class A{
    static int a;
    A(){
        a++;
        System.out.println(a);
    }
}
public class StaticKeyword {

    public static void main(String[] args) {
        new A();
        new A();
        new A();
        new A();
        new A();
    }
}