
import java.lang.reflect.Array;
import java.util.ArrayList;

class Iterator{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        java.util.Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
       System.out.println(it.next());
       if(it.next()==6){
        it.remove();
       }
        }
    }
}