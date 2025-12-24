class CountVowelGivenString{
    public static void main(String[] args) {
        String s="omprakash patel";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.err.println(count);
    }
}