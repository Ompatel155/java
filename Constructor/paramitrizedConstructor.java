class car{
    car(String str){
        System.out.println(str);
    }
}
public class paramitrizedConstructor{
    public static void main(String[] args) {
        car obj=new car("Hello");
        car obj1=new car("Hiii");
        car obj2=new car("Raj bhadhwa");
    }
}