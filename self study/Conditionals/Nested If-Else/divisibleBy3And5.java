
import java.util.Scanner;

class divisibleBy3And5{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
         int Num =sc.nextInt();
         if(Num%5==0){
            if(Num%3==0){
                System.out.println("The Number is divisible by 3 and 5");
            }
        
         }
         else{
            System.out.println("Not divisible by 3 and 5");
         }
    }
}