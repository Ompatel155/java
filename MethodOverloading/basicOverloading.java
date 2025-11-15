class basicOverloading{
    void sum(){
        System.out.println("hello");
    }
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        basicOverloading obj=new basicOverloading();
        obj.sum(155226,27727);
    }
}

