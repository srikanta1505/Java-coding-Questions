public class palindromeNumber {
    public static void main(String[] args) {
        int num =121;
        int n =num;
        int rem,rev=0;
        while (num>0)
        {
         rem=num%10;
         rev=(rev*10)+rem;
         num=num/10;   
        }
        if (n== rev)
        System.out.println("This number is palindrome");
        else
        System.out.println("This is not a palindrome number");
    }
}
