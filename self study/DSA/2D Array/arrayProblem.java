class arrayProblem{
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int k=3;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(j-i>k){
                    break;
                }
                if(i==j){
                    System.err.println("true");
                    break;
                }
                
                }
                
            }
        
        
    }
}
