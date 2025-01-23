public class ArrayIndex {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3};
            a[8]=9;
            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("handle");
        }
    }
}
