// Aray  passing by refrence hota hai passing by value nahi hota...
class passingArrayMethods{
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
    static void change(int arr[]){//yaha arr ki jagah kuchh or bhi likh sakte hai or error bhi nahi ayega kyu ye passing by refrence hota hai.
        arr[1]=10;
    }
}