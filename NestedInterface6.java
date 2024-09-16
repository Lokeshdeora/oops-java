 //class
     //interface 
	//class 

//access
interface A{
    interface B{
        class C{
            void method(){
                System.out.println("method in C class");
            }
        }
    }
}
class D extends A.B.C{

}
public class NestedInterface6 {
    public static void main(String[] args) {
        D d = new D();
        d.method();
    }
}
