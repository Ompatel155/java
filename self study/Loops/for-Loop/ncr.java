
import java.util.Scanner;
class ncr{ 
    public static void main(String[] args) {
      Scanner  sc=new Scanner(System.in);
      System.out.print("Enter the n : ");
      int n=sc.nextInt();
      System.out.print("Enter the r : ");
      int r=sc.nextInt();
      int nFact=1;
      for(int i=1;i<=n;i++){
        nFact*=i;
      }
      int rFact=1;
      for(int i=1;i<=r;i++){
        rFact*=i;
      }
      int n_rFact=1;
      for(int i=1;i<=n-r;i++){
        n_rFact*=i;
      }
      int ncr = nFact/(rFact*n_rFact);
      System.out.print("nCr : "+ncr);
      
    }
}