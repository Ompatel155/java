import java.util.Scanner;
class finding1555Remainder{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Eneter divided : ");
        int a = sc.nextInt();
        System.out.println("Enter Divivsor : ");
        int b = sc.nextInt();
        int r = a % b;
        System.out.println("Remainder is : "+r);
    }
}