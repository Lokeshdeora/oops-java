//constructor overloading 
	//parameter same and return type of parameter change 
	//parameter number change
    class A{
        A(int a,int b){
            System.out.println(a+" "+b);
        }
        A(float a,float b){
            System.out.println(a+" "+b);
        }
    }
    public class Polymorphism3 {
        public static void main(String[] args) {
            new A(20, 3);
            new A(3.4f, 4.5f);
        }
    }
