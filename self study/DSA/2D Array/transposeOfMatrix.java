class transposeOfMatrix{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{2,4,6,8},{1,3,5,7},{5,6,7,8}};
        System.out.println("Original Matrix:");
        print(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose Matrix: ");
print(arr);  
    }
    static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}