class RightRotationbyArray{
    static void RightRotate(int arr[],int d){
        int n = arr.length;
        d = d%n;
        for(int i=0;i<d;i++){
            int last = arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
               
            }
           arr[0] = last;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7,11,13,17};
        RightRotate(arr, 3);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}