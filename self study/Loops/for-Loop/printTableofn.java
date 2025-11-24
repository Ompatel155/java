
import java.util.Scanner;

class printTableofn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for(int i=n;i<=10*n;i+=n){
       System.out.println(i);
        }
    }
}