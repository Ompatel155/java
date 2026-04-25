class printName{
    void printName(int i){
        if(i>10)
         return;
        System.out.println("Om patel");
    printName(i+1);

    }
    public static void main(String[] args) {
        printName obj = new printName();
        obj. printName(0);
    }
}