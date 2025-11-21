import java.util.Scanner;

class TwoDigitNumOrNot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(num>9 && num<100){
            System.out.println("This is a Two Digit Numbar");
        }
        else{
            System.err.println("This is Not a Two Digit Number");
        }
    }
}