
import java.util.Scanner;

class ThreeDigitNumOrNot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("This is a Three Digit Numbar");
        }
        else{
            System.err.println("This is Not a Three Digit Number");
        }
    }
}