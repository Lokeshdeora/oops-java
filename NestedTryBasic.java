public class NestedTryBasic {
    public static void main(String[] args) {
        try{
            try{
                int a=9/0;
                System.out.println(a);
            }catch(ArithmeticException ex){
                System.out.println("handle");
            }
        }catch(Exception ex){
            System.out.println("handle");
        }
    }
}
