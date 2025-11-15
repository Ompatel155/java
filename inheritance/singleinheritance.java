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
public class singleinheritance{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.bark();
        obj.Eat();
    }
}