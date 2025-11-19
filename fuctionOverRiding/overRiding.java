class Animal{
    void Eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal {
    void Eat(){
        System.out.println(" biryani");
    }
    void Data(){
        System.out.println("Hello");
    }
}
class overRiding{
   // 
    public static void main(String[] args) {
        Animal obj1 =new Dog();
            obj1.Eat();
         Dog obj2 =(Dog)obj1;//typecasting kiye  haiiiii
           obj2.Data();

    }
}