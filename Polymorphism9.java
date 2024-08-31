//class
//	a
//	b--->c
//	c---->f
//	d--->b
//	e--->a
class A{
    void a(){
        System.out.println("a() method");
    }
    void b(){
        c();
        System.out.println("b() method");
    }
    void c(){
        d();
        System.out.println("c() method");
    }
    void d(){
        e();
        System.out.println("d() method");
    }
    void e(){
        a();
        System.out.println("e() method");
    }
}
public class Polymorphism9 {
    public static void main(String[] args) {
        A obj = new A();
        obj.b();
    }
    
}
