class LeftRotationbyArray{
    static void leftRotate(int arr[],int d){
        int n= arr.length;
        d=d%n;
        for(int i=0;i<d;i++){
            int first =arr[0];
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7,11,13,17};
     leftRotate(arr,2);
     for(int x : arr)
     System.out.print(x + " ");
    
    }
}