//class
//	method
//		interface 
//			method 

//access
class A{
    void show1(){
        System.out.println("Hello..");
        interface B{
            void show2();
        }
        B b = new B() {
            public void show2(){
                System.out.println("Good Morning");
            }
        };
        b.show2();
    }
}
public class NestedClass4 {
    public static void main(String[] args) {
        A a = new A();
        a.show1();
    }
}
