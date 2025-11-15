class Animal{
    void Eat(){
        System.out.println("Land khayega BSDK");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bhoo Bhoo...");
    }
}
class Bitch extends Dog{
    void sex(){
System.out.println("puppy!");
    }
}
public class multiLevelinheritance{
    public static void main(String[] args) {
        Bitch obj=new Bitch();
        obj.bark();
        obj.Eat();
        obj.sex();
    }
}