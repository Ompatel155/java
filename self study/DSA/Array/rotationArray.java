class rotationArray{
    static void rotate(int arr[],int d){
        int n=arr.length;
        d=d%n;
        for(int i=0;i<d;i++){//left Rotation
            int first =arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];

            }
            arr[n-1]=first;
        }
        for(int i=0;i<d;i++){//right Rotation
            int last =arr[n-1];
            for(int j=n-1;j>0;j--){
               arr[j]= arr[j-1];
            }
            arr[0]=last;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7,11,13,17};
        rotate(arr,4);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}