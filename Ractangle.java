import java.util.Scanner;
class area{
    int length;
    int breadth;

void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length");
    int length = sc.nextInt();
System.out.println("Enter the breadth");
    int breadth = sc.nextInt();
        System.out.println("Area =" + (length*breadth));
    }
    }
public class Ractangle{
    public static void main(String[] args) {
        area obj=new area();
        obj.input();
        
    }
}
