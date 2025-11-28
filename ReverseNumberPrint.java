
import java.util.Scanner;

class ReverseNumberPrint{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        int Reverse =0;
        while(n!=0){
            int lasdigit =n%10;
            Reverse*=10;
            Reverse+=lasdigit;
            n/=10;
        }
       System.err.println("Reverse Oder : "+Reverse);
    }
}