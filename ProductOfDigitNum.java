
import java.util.Scanner;

class ProductOfDigitNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
         int  product = 1;
         while (n!=0) {
             int lasdigit =n%10;
             product*=lasdigit;
             n/=10;
             
         }
         System.out.println(product);

    }
}