// -------static variable-----
// public class variable{
//     static int a =5;
//     public static void main(String[] args) {
//         System.err.println(a);
//     }
// }



// ---------Non-static---------



 public class variable{
    int a = 3;
    public static void main(String[] args) {
        variable obj=new variable();
        System.out.println(obj.a);
    }
 }