import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range");
        int range=sc.nextInt();

        int a=0,b=1,sum=0;

        System.out.print(a+" "+b+" ");
        for(int i=1;i<=range;i++)
        {
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}
