
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

// 3,12,48,192....upto n.
class SolveGP2{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();
    int a=3;
    int r=4;
    for(int i=1;i<n;i++){
        System.out.print(a+" ");
        a*=r;
    }
    }
}