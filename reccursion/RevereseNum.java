class RevereseNum{
    static int rev = 0;
    static int Reverse (int n){
if(n==0) return rev;
rev =rev * 10 + n%10;
return Reverse(n/10);

    }
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(Reverse(n));
    }
}
