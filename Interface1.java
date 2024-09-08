//class A:abstract 
//	covariant return type :abstract  

//class B:abstract 
//	return and argument  :abstract  
	
//class C:abstract 
//	return and no argument  :abstract  

//class D:abstract
//	return and argument  :abstract  

//extends in another class 

//Main class 
//	anonymous inner classs
abstract class A {
    abstract A display();
}
abstract class B {
    abstract int method(int a);
}
abstract class C {
    abstract int method1();
}
abstract class D {
    abstract int method2(int a);
}
class A1 {
    void covar(){
        A o = new A() {
            A display(){
                System.out.println("Covarient return type abstract method");
                return this;
            }  
        };
        o.display();
    }
    void disp1(){
        B b = new B() {
            int method(int a){
                return a;
            }
        };
        System.out.println("abstract method return & argument "+b.method(9));
    }
     void disp2(){
        C c = new C() {
            int method1(){
                System.out.println("return & no argument abstract method");
                return 0;
            }
        };
        c.method1();
    }
    void disp3(){
        D d = new D(){
            int method2(int a){
                return a;
            }
        };
        System.out.println("abstract method return & argument "+d.method2(80));
    }
}
public class Interface1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.covar();
        a1.disp1();
        a1.disp2();
        a1.disp3();  
    }
}
