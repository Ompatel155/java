

class RowWithmaxSum{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{2,4,6,8},{3,6,9,12}};
        int maxsum=Integer.MIN_VALUE;
        int row=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
               sum+=arr[i][j];
                }
                if(sum>maxsum){
                    maxsum = sum;
                    row=i;
                }
               
            }
             System.out.println("row no:"+ row+" "+maxsum);
        }
    }
