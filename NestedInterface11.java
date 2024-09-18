// interface 
	//interface 
	//	class 

//access
//anonymous inner class
interface A{
    void show1();
  }
  interface B extends A{
      void show2();
  }
   class C{
          public void show3(){
                  System.out.println("Hello....");
          }
  }
public class NestedInterface11 {
    public static void main(String[] args) {
        
        
        B b = new B(){
            public void show1(){
            System.out.println("Hiii...");
        }
           public void show2(){
            System.out.println("Good Morning...");
        } 
        };
        b.show1();
        b.show2();
        C c = new C();
        c.show3();
    }
}
