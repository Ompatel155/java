
import java.util.Scanner;

class RectangleSquareHaiYaNahi{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length=sc.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("Rectangle square ke Equal..!");
        }
        else{
            System.out.println("Rectangle Square ke Equal nahi hai");
        }
    }
}