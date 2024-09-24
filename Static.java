//outer class non static and inner class static and method  static :
class A {
    static class B{
        static void show(){
            System.out.println("static method in static inner Class");
        }
    }
}
public class Static{
    public static void main(String[] args) {
        A.B.show();
    }
}