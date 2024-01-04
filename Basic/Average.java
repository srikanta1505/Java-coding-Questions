import java.util.Scanner;

public class Average {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements to the array");
        int x=sc.nextInt();
        int arr[]= new int[x];
        int sum=0,avg;

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        avg=sum/x;

        System.out.println("The average of array elements are: "+avg);
    }
}
