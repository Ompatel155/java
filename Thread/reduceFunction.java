import java.util.*;
class reduceFunction{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
       int data = list.stream().reduce(0,(a,b)-> a + b);
       List<Integer> skip=list.stream().skip(2).toList();
       List<Integer> limit=list.stream().limit(2).toList();
       List<Integer> sort =list.stream().sorted((a,b)->a-b).toList();
        System.out.println(data);
       System.out.println(skip);
       System.out.println(limit);
       System.out.println(sort);
       
      

}
}
