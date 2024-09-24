//outer class non  static and inner class non static and method  static :
class A{
    class B{
        static void disp(){
            System.out.println("Static method disp inside non static inner class");
        }
    }
}
public class Static1 {
    public static void main(String[] args) {
        A.B.disp();
    }
}
