
import java.util.*;

public class Factorial {
         public static void main(String[]args){
         
         System.out.println("enter number=");
         Scanner sc= new Scanner(System.in);
         int num= sc.nextInt();
         
         int fact =1;
         sc.close();
         for(int i=num;i>=1;i--)
           fact = fact*i;
           System.out.println("factorial of "+num +"="+fact);
        }
    
      }