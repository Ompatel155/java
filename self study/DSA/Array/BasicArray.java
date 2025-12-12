
import java.util.Scanner;

class BasicArray{
    public static void main(String[] args) {
        // first type create Array...



        // int x[]={1,2,3,4,5,6};
        // // int n= x.length;
        // for(int i=0;i<x.length;i++){
        //     System.err.print(x[i]+" ");
        // }


        // Second type create Array...
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Array Element : ");
            arr[i]=sc.nextInt();

        }
        System.err.print("Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}