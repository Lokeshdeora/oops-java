//class A 
//	static class B static method and instance variable non static 

//	static class C static method and instance variable non static 
class A{
    static class B{
        int a = 20;
        static void disp1(){
            System.out.println(a);
        }
    }
    static class C{
        int b = 200;
        static void disp2(){
            System.out.println(b);
        }
    }
}
public class Static9 {
    public static void main(String[] args) {
        A.B.disp1();
        A.C.disp2();
    }
}
