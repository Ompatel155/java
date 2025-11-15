class Animal{
    void Eat(){
        System.out.println("i am eat..!");
    }
}
class Dog extends Animal{
    void male(){
        System.out.println("i am male..!");
    }
}
class Bitch extends Animal{
    void female(){
System.out.println("i am female..!");
    }
}
public class Hybridinheritance{
    public static void main(String[] args) {
        Dog D1=new Dog();
        D1.male();
        D1.Eat();
        Bitch B1=new Bitch();
         B1.female();
         B1.Eat();
    }
}