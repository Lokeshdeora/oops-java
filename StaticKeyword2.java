public class StaticKeyword2 {
    
    static int a = 70;
    static void show(){
        a = 900;
        System.out.println("static method no retutn & no argument "+a);
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
    static StaticKeyword2 show4(){
        System.out.println("static method with covariant return type");
        return new StaticKeyword2();
    }
    public static void main(String[] args) {
        show();
        show1(90);
        show2();
        System.out.println("static method return & argument "+show3(222));
        StaticKeyword2.show4();
    }
}

