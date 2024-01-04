import java.util.Scanner;

public class Even_Odd_In_Array_Using_Recursion {

    public static void rec(int arr[],int i){

    if (i>=arr.length)
    return ;

    if(arr[i]%2==0)
    System.out.println(arr[i]+" is even");
    else
    System.out.println(arr[i]+" is odd");
    rec(arr,i+1);
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        System.out.println("enter number of array elements of your wish:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int j=0;j<arr.length;j++)
        {
            arr[j]=sc.nextInt();
        }
        rec(arr,i);
    }
}


