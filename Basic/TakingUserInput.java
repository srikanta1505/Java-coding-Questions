import java.util.Scanner;

public class TakingUserInput {
     public static void main(String[] args)
         {
             /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                    Scanner sc= new Scanner(System.in);
                    System.out.println("enter String");
                    String x=sc.nextLine();
                    System.out.println("Enter Number");
                    int myInt = sc.nextInt();
                    
                    sc.close();
                    System.out.println("myString is: " +x );
                    
                    System.out.println("myInt is: " + myInt);
         System.out.println();
         }
}
