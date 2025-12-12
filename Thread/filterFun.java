
import java.util.*;

class filterFun{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        List<Integer>res = list.stream().filter(n->n>6).toList();
        System.err.println(res);

    }
}