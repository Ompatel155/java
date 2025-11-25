import java.util.Scanner;

// AP - 4,7,10,13,16......upto n.
// an = a + (n-1)d
//    a=4  , d=3
//   an = 4 + (n-1)3
//   an = 3n+1
class SolveAP2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=4;i<=(3*n+1);i+=3){
            System.out.print(i+" ");
        }
    }
}