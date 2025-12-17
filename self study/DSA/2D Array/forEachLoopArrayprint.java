class forEachLoopArrayprint{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{2,4,6,8},{3,6,9,12}};
        for(int a[]:arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}