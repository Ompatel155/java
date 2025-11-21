
import java.util.Scanner;

class divisible5And3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("the Number is divisible by 5 & 3");
        }
        else{
            System.out.println(" Not divisible by 5 & 3");
        }
        }
    }
