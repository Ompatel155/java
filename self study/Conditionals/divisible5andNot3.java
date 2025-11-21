
import java.util.Scanner;

class divisible5andNot3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        if(num%5==0 && num%3!=0){
            System.out.println("the number is divisible by 5 but Not 3");
        }
        else{
            System.out.println("Not divisible by 5 but not 3");
        }
    }
}