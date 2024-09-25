//outer class  non static and inner class static and method  non static and instance variable static 
class A{
    static class B{
        static String s = "HEY LOKESH DEORA......";
        public void hello(){
            System.out.println(s);
        }
    }
}
public class Static5 {
    public static void main(String[] args) {
        A.B a = new A.B();
        a.hello();
    }
}
