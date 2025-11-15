class AreaOfDifferentShapes{
    void Area(int side){
        System.out.println("sqauare : "+side*side);
    }
    void Area(int L,int B){
        System.out.println("Rectangle : "+L*B);
    }
    void Area(float length,float Breadth){
        System.out.println("triangle :"+1/2*(length*Breadth));
    }
    void Area(float r){
        System.out.println("circle : "+2*3.14*r);
    }
    public static void main(String[] args) {
        AreaOfDifferentShapes obj=new AreaOfDifferentShapes();
        obj.Area(4.0f);
    }
}