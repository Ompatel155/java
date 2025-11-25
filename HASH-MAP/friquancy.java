import java.util.*;
class friquancy{
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]={2,2,3,4,2,4,2};
        for(int x:arr){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        System.out.println(map);
    }
}