import java.util.Scanner;
 public class DivisibleBy5{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Entere the number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("The number you Enterd is divisble by 5...!");
        }
       else{
        System.out.println("Not divisible by 5..!");
       }
    }
}