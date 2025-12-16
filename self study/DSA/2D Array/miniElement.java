class miniElement{
    
    public static void main(String[] args) {
        int arr[][]={{2,4,6,8},{3,6,9,12},{4,8,12,16}};
        int mini= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                
            if(mini>arr[i][j]){
                mini=arr[i][j];
            }
            } 
           
        }
         System.out.print("Minimum Element in 2D Array : "+mini);
        }
}