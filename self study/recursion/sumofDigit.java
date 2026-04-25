class sumofDigit{
    static int sum=0;
    static int sum_of_Digit(int n) {
        if(n==0) return 0;
        int last_digit =n%10;
        return  last_digit+sum_of_Digit(n/10);
        
    }
    public static void main(String[] args) {
        System.out.println("sum_of_Digit : "+sum_of_Digit(123));
    }
}