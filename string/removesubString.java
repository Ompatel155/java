class removesubString{
    public static void main(String[] args) {
         String str="banana";
         char remove='a';
          String result ="";
         
         for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(remove !=ch){
            result +=str.charAt(i);
                
            }
         }
         System.out.print(result);
    }
}