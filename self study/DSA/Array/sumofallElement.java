class sumofallElement{
    public static void main(String[] args) {
        int arr[]={1,3,5,5,643,3};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.err.println(sum);
    }
}