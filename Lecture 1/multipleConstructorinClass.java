class Hello{
   public Hello(){
        this(5);
        System.out.println("hiiii");
    }
    public Hello(int a){
this(5,6);
System.out.println(a);
    }
    public Hello(int a,int b){
        System.out.println(a);
    }
}
public class multipleConstructorinClass{
    public static void main(String[] args) {
        Hello obj = new Hello();
    }
}