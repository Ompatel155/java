class oneToten{
     static int print(int i){
        if(i>10) return 0;
        System.out.println(i);
       return print(i+1);
    }
    public static void main(String[] args) {
        print(1);
    }
}