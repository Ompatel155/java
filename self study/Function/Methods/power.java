
import java.util.Scanner;

class power{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.err.println("Enter the a : ");
    int a = sc.nextInt();
    System.err.println("Enter the b : ");
    int b = sc.nextInt();
    int pow =1;
    for(int i= 1;i<=b;i++){
        pow *=a;
    }
    System.out.println(pow);

}
}