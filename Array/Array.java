class Array{
    int sum(int arr[][]){
        int data = 0;
        for(int i=0;i<2;i++){
            for( int j=0;j<2;j++){
                data+=arr[i][j];
            }
        }
        return data;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4}};
        Array obj=new Array();
       int value= obj.sum(arr);
        System.err.println(value);
    }
}