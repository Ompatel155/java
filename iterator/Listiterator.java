
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Listiterator{
    public static void main(String[] args) {
     ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
      ListIterator<Integer> it=list.listIterator();
      while(it.hasNext()){
        Integer x=it.next();
        if(x%2==1){
          it.set(-1);
         
        }
     
      }
      System.out.println(list);
       
    
    }
}