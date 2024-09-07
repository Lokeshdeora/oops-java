//class A :abstract 
//	method1 : abstract :no return and argument 
//	method2 :no abstract :no return and argument 

//	method3 :abstract :no return and argument 

//	method4 :non abstract :no return and argument 

//anonymous inner class 
abstract class A{
    abstract void show1(int a);
    void show2(int a){
        System.out.println("show2 non-abstract mwthod "+a);
    }
    abstract void show3(int a);
    void show4(int a){
        System.out.println("show4 non-abstract mwthod "+a);
    }
}
public class Interface{
    public static void main(String[] args) {
        A obj = new A() {
            void show1(int a){
                System.out.println("show1 abstract method "+a);
            }
            void show3(int a){
                System.out.println("show3 abstract method "+a);
            }
        };
        obj.show1(50);
        obj.show2(30);
        obj.show3(60);
        obj.show4(70);
    }
}