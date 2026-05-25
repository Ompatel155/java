class XtoN{
    static int print(int x,int n) {
        if(x==0) return 0;
        if(n==0) return 1;
        return x * print(x, n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(print(2, 3));
    }
}