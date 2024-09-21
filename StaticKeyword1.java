//another 

//class 
//	method :no return and no argument :static 
//	method :no return and  argument :static 	method : return and no argument :static 	method : return and  argument :static
//access 
class A{
    static void show(){
        System.out.println("static method no retutn & no argument");
    }
    static void show1(int x){
        System.out.println("static method no return & argument "+x);
    }
    static int show2(){
        System.out.println("static method return & no argument");
        return 0;
    }
    static int show3(int x){
        return x;
    }
}
public class StaticKeyword1 {
    public static void main(String[] args) {
        A.show();
        A.show1(10);
        A.show2();
        System.out.println("static method return & argument "+A.show3(100));
    }
}
