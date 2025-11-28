
import java.util.HashMap;
import java.util.HashSet;

class interSectionOfArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr1[]={3,4,5,6};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for(int x:arr){
          set1.add(x);
        }
        for(int y:arr1){
            if(set1.contains(y)){
                result.add(y);

            }
        }
        System.out.println("interSection  : "+result);
        }
    }
