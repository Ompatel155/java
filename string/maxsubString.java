class maxsubString{
    public static void main(String[] args) {
        String str="a3b2c9d5e8";
        char max=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= '0'&&ch<='9'&& ch>max){
            max =ch;
        }
        
    }
     System.out.println(max);
}
}