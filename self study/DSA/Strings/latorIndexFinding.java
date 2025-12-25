class latorIndexFinding{
    public static void main(String[] args) {
        String s="om patel";
        System.err.println(s.indexOf('p'));

        // iska use tab kate hai jab string me same same lator hote hai tolast wale ke index number btata hai.
        String s1="anand";
        System.out.println(s1.lastIndexOf('a'));
         
        //  captal Lator ko small Lator me change karne ke liye kiya jata hai
        String s2="OM Patel";
        System.out.println(s2.toLowerCase());

        // small se captal me change karne ke liye kiya jaya hai
        String s3="om patel";
        System.out.println(s3.toUpperCase());

        // string ke ander substring hai ki nahi ye check karne ke liye kiya jata hai
        String s4="omprakash";
        System.out.println(s.contains("om"));

    }
}