import java.util.Scanner;

public class EvenOdd_with_Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range =sc.nextInt();

        int evenArr[]=new int[range];
        int oddArr[]= new int[range];

        for(int i=0;i<range;i++)
        {
            if(i%2==0)
            evenArr[i]=i;
            else
            oddArr[i]=i;
        }
        System.out.println("Even number series is ");
        for (int i=0;i<range;i++)
        {
            if(evenArr[i]!=0)
               System.out.print(evenArr[i]+" ");
        }
        System.out.println();
        System.out.println("The odd number series is :");
        for(int i=0;i<range;i++)
        {
             if (oddArr[i]!=0)
                System.out.print(oddArr[i]+" ");
        }
    }
}
