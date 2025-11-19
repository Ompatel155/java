abstract class Animal{
 abstract void Eat();
}
class Dog extends Animal{
void Eat(){
System.out.println("om patel........");
}
}
class AbstractClass{
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.Eat();
    }
}