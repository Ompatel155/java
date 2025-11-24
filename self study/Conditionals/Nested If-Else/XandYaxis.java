
import java.util.Scanner;

class XandYaxis{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.err.print("Enter the X : ");
        int x =sc.nextInt();
        System.out.print("Enter the Y : ");
        int y =sc.nextInt();
        if(x==0 && y==0){
            System.out.println("The point is Origin");
        }
        else if(x==0){
            System.out.println("The point lies on y-axis");
        }
        else{
            System.out.println("The point lies on x-axis");
        }
    }
}