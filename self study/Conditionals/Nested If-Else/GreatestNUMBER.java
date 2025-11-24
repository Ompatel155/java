
import java.util.Scanner;

class GreatestNUMBER{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first   Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b =sc.nextInt();
        System.out.print("Enter third number : ");
        int c =sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is largest");
            }
            else{
                System.out.println(c+" is largest");
            }
        }
        else{ // else a<b ka kam kar raha hai yaha par
        if(b>c){
            System.out.println(b+" is largest ");
        }
        else{
            System.out.println(c+" is largest");
        }

       }
    }
}