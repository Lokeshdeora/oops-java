//outer class  non static and inner class static and method  non static :
class A{
    static class B{
        void show(){
            System.out.println("non-static method inside static inner class");
        }
    }
}
public class Static3 {
    public static void main(String[] args) {
        A.B a = new A.B();
        a.show();
    }
}
