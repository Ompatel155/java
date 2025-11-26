
// import java.util.Scanner;

// class PrimeAndComposite{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n =sc.nextInt();
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 System.out.println("Composite Number");
//                 break;
//             }
//             else{
//                 System.out.println("Prime Number");
//                 break;
//             }
//         }
//     }
// }










import java.util.Scanner;

class PrimeAndComposite{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int n =sc.nextInt();
        boolean isprime = true;
        for(int i=2;i<n;i++){
            if(n%i==0)
             isprime = false;
             break;
        
         }
         if(isprime==true){
             System.out.println("Prime Number");
         }
         else{
            System.out.println("Composite Number");
         }
        
    }
}