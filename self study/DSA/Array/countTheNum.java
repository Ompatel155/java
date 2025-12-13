// Count the Number od\f element in given array greater than a given number x.
class countTheNum{
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,2,3,7,6};
        int x = 4;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x)
            count++;
        }
        System.out.println(count);
    }
}