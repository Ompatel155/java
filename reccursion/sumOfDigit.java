class sumOfDigit{
    static int sumOfdigit(int x){
        if(x==0)return 0;
        return x%10 + sumOfdigit(x/10);
    }
    public static void main(String[] args) {
        int x=12345;
        System.out.println(sumOfdigit(x));
    }
}      