abstract class shape{
    abstract void area();
}
class circle extends shape{
    int r;
    public circle(int r){
   this.r =r;
    }
    void area(){
        double area = 3.14*r*r;
        System.out.println("circle ka area : "+area);
    }
}
class rectangle extends shape{
    int length;
    int b;
    public rectangle(int length,int b){
        this.length = length;
        this.b = b;
    }
void area(){
    double area = length*b;
  System.out.println("ractangle ka area : "+area);

}
}
class Area{
    public static void main(String[] args) {
        circle obj =new circle(2);
        obj.area();
        rectangle obj2 = new rectangle(4,5);
        obj2.area();
    }
}
