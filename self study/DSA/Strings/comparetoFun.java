class comparetoFun{
    public static void main(String[] args) {
        String a="om patel";
        String b="raunak singh";
        System.out.println(a.compareTo(b));

        // jab do string alag alag hai to usko ek sath likhne ke liye
        String A="OM ";
        String B="PRINCE";
        System.out.println(A.concat(B));

        // String ko Array me convert karne ke liye
        String str="omprakash";
        char arr[]=str.toCharArray();
        for(char ch:arr){
            System.out.print(ch+" ");
        }
    }
}
