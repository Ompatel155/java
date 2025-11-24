import java.util.Scanner;

class divisibleby3and5butNot15{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
         int Num =sc.nextInt();
         if(Num%3==0 || Num%5==0){
            if(Num%15!=0){
                System.out.println("The Number is divisible by 3 and 5 but Not 15");
            }
        
         }
         else{
            System.out.println("Not maching the required condition");
         }
    }
}