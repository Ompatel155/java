
import java.util.Scanner;

class SideOfTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Side : ");
        int a = sc.nextInt();
        System.out.print("Enter Scond Side : ");
        int b = sc.nextInt();
        System.out.print("Enter third Side : ");
        int c = sc.nextInt();
        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("Valid Traingle....!");
        }
        else{
            System.out.println("Invalid Traingle....!");
        }
    }
}