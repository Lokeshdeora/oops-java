 //class 
	//interface 
	//	class
	//		interface
	//			class 

//access
class A{
    interface B{
        class C{
            interface D{
                class E{
                    void show(){
                        System.out.println("show method in E class");
                    }
                }
            }
        }
    }
}
class F extends A.B.C.D.E{

}
public class NestedInterface12 {
    public static void main(String[] args) {
        F f = new F();
        f.show();
    }    
}
