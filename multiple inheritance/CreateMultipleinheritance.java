interface  A{
    void sleep();
    default void data (){

System.out.println("hehe");
    }
}
interface B {
void sleep();
}
class C implements A,B{
    public void sleep(){
    System.out.println("hello");
    }
}
class CreateMultipleinheritance{
    public static void main(String[] args) {
    C obj = new C();
    obj.sleep();
    obj.data();
}
}