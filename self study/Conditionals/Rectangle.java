import java.util.Scanner;

class Rectangle{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the lenght : ");
        int l =sc.nextInt();
        System.out.println("Enter the breadth : ");
        int b =sc.nextInt();
        int Area =l*b;
        int perimeter = 2*(l+b);
        if(Area>perimeter){
            System.out.println("Area is greater then of perimeter");
        }
        if(Area<perimeter){
            System.out.println("Area is less then of perimeter");
        }
        if(Area==perimeter){
            System.out.println("Area is equal to perimeter");
        }
    }
}