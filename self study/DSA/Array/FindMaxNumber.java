class FindMaxNumber{
    public static void main(String[] args) {
        int arr[]={10,30,50,400,20,40,60};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.err.println(max);
    }
}