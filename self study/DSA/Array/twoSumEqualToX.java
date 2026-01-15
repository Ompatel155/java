class twoSumEqualToX{
    public static void main(String[] args) {
        int arr[]={83,21,38,69,74,12};
        int x=81;
        for(int i=0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
            if(arr[i]+arr[j]==x){
                System.out.println(".Index : "+i+" "+j);
                
                
            }
            
            }
        }
    }
}