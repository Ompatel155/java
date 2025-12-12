import java.util.*;
class mapFun{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        List<Integer>res = list.stream().map(n->n*2).toList();
        System.out.println(res);

}
}
