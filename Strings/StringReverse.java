import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string : ");
        String str= sc.nextLine();
        sc.close();

        for (int i=str.length()-1;i>=0;i--)
        {
                System.out.print(str.charAt(i));
        }
    }
    
}
