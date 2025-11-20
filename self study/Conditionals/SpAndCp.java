
import java.util.Scanner;

class SpAndCp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
         int Cp =sc.nextInt();
         System.out.println("Enter the selling price : ");
         int Sp =sc.nextInt();
         if(Cp>Sp){
            System.out.println("You incurred a loss : "+(Sp-Cp));
         }
         if(Sp>Cp){
            System.out.println("You made a profit : "+(Sp-Cp));
         }
         if(Cp==Sp){
           System.out.println("No Loss,No PROFIT : "+(Cp-Sp));
         }

         }
        }