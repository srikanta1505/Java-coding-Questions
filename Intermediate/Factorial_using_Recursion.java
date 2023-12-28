// package Intermediate;
import java.util.Scanner;

public class Factorial_using_Recursion {

    public static int Factorial(int num){
        if (num==1 ||num==0)
        return 1;
        int fact =num*Factorial(num-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        Factorial(n);
        System.out.println(Factorial(n));
    }
}
