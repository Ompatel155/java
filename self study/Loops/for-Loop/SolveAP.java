
import java.util.Scanner;

// AP - 1,3,5,7,9......upto n.
//  an = a + (n-1)d
//    a=1 , d=2
//   an = 1 + (n-1)2
//   an = 2n-1
class SolveAP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=1;i<=(2*n-1);i+=2){
            System.out.print(i+" ");
        }
    }
}