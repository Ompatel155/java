class main{
    public static void main(String[] args) {
        String str1="hello";
        System.out.println(str1);
        String str2= new String("Hi");
        System.out.println(str2);
        System.out.print(str1.length());
        System.out.print(str1.charAt(1));
        System.out.print(str1.substring(0,3));
        System.out.print(str1.equals(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.contains("hello"));
        System.out.println(str1.replace('l','z'));
        String str3= str1.concat("World");
        System.out.println(str3);
    }
}