import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements:");
        int num=sc.nextInt();
        int a[]= new int[num];

        for (int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the array elements are :");
        for (int i=0;i<num;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("the duplicate elements are :");

        for (int i=0;i<num;i++){
            for (int j=i+1;j<num;j++)
            {
                if ((i!=j) && (a[i]==a[j]) )
                     System.out.print(a[j]+" ");
            }
            
        }
    }
}
