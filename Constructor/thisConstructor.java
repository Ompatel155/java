class Car{
    int a;
    Car(int a){
        this.a=a;
    }
}
public class thisConstructor{
    public static void main(String[] args) {
    Car obj=new Car(5);
// obj.a
    System.err.println(obj.a);
    }
}