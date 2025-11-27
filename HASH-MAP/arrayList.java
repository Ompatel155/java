import java.util.*;
class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list=new java.util.ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
    }
}