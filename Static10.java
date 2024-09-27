//class A 
//	static class B static method and instance variable  static 

//	static class C static method and instance variable  static 
class A{
    static class B{
        static int a = 20;
        static int disp1(){
            return a;
        }
    }
    static class C{
        static int a = 200;
        static int disp2(){
            return a;
        }
    }
}
public class Static10 {
    public static void main(String[] args) {
        System.out.println(A.B.disp1());
        System.out.println(A.C.disp2());
    }
}
