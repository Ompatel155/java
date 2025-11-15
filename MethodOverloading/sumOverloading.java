class sumOverloading{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(float a,float b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sumOverloading obj=new sumOverloading();
        obj.sum(1.3f,2.5f);
    }
}