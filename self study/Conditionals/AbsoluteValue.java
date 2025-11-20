
import java.util.Scanner;

class AbsoluteValue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number : ");
        int n =sc.nextInt();
        if(n<0){  //if n is less then Zero
        n = n*(-1);
      System.out.println("the absolute value is : "+n);
        }
        else{
            System.out.println("the absolute value is : "+n);
        }
    }
}