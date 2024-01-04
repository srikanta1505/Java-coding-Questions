import java.util.Scanner;

public class Even_Odd_Upto_a_Range_Using_Recursion {

    public static void rec(int range,int i){
        if(i>range)
        return;

        if( i<=(range/2) && i%2==0 )
        {
            System.out.println(i +"is even");
        }

        if (i>(range/2) && i%2!=0)
        {
            System.out.println(i+ "is odd");
        }
        rec(range,i+1);
    }
    public static void main(String[] args) {
        int i=1;
        Scanner sc= new Scanner(System.in);
        int range=sc.nextInt();
        sc.close();
        rec(range,i);
    }
}
