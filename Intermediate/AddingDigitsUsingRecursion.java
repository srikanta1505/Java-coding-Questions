public class AddingDigitsUsingRecursion {
    public static int recursion(int num){

        
        if (num==0)
        return 0;
        else
            return (num%10)+recursion(num/10);
    }
    public static void main(String[] args) {
        int num= 348;
        
        System.out.println(recursion(num));
    }
}
