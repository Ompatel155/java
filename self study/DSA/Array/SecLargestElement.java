class SecLargestElement{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max)max=arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max)
                smax=arr[i];
            

        }
        System.out.println("Second largest Element : "+smax);
        }
    }
