class miniElementEachofRow{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{2,4,6,8},{3,6,9,12}};
        int rowmax;
        int finalmini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            rowmax=Integer.MIN_VALUE;
            for(int j=0;j<arr[i].length;j++){

                if(rowmax<arr[i][j]){
               rowmax=arr[i][j];           
                 }
            }
            if(finalmini>rowmax){
                finalmini = rowmax;
            }
        }
        System.out.println(finalmini);
    }
}