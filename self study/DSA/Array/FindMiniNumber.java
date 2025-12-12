class FindMiniNumber{
    public static void main(String[] args) {
        int arr[]={10,30,50,400,20,40,60};
        int mini=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
           
        }
         System.err.println(mini);
    }
}