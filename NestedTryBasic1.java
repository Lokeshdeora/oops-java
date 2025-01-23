public class NestedTryBasic1 {
    public static void main(String[] args) {
        try{
            try{
                int a=9/0;
                System.out.println(a);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Arrayindexoutof bond handle");

            }
        }catch(Exception ex){
            System.out.println("handle");
        }
    }
}
