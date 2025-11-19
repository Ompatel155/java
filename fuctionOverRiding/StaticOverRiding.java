class parent{
    static void staticMethod(){
        System.out.println("parent ka static haiii");
    }
    void instanceMethod(){
        System.out.println("parent ka instance haiii");
    }
}
class child extends parent{
   static void staticMethod(){
        System.out.println("child ka static haii");
    }
    void instanceMethod(){
        System.out.println("child ka instance haii");
    }
}
class StaticOverRiding{
    public static void main(String[] args) {
        parent obj = new child();
        obj.staticMethod();
        obj.instanceMethod();
    }
}