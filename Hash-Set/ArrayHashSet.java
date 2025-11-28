
import java.util.HashSet;

class ArrayHashSet{
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(x)){
                System.out.println(true);
            
            }
            set.add(x);
                System.out.println(false);
            }
        }
        
    }
    