import java.util.Scanner;
public class Addition {
public static void main(String[] args) {

    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter value of a= ");;

    int a=sc.nextInt();
    System.out.println("Enter value of b =");
    int b=sc.nextInt();

    sc.close();
    

    sum=a+b;
    System.out.println("The Total sum is = "+sum);
    
}
    
}