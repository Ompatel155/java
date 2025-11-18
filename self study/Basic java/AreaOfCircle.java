
import java.util.Scanner;

class AreaOfCircle{
    public static void main(String[] args) {
        // input lene ke liye ........
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        double r = sc.nextDouble();
        double area = 3.1415*r*r;
        System.err.println("Area of circle : "+area);
    }
}

