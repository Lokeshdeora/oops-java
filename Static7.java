//outer class  non static and inner class non static and method  non static and instance variable non static 
class A{
    class B{
        int a = 80;
        public int display(){
            return a;
        }
    }
}
public class Static7 {
    public static void main(String[] args) {
        A a = new A();
        A.B k = a.new B();
        System.out.println(k.display());
    }
}
