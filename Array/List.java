import java.util.ArrayList;
class List{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(50);
        list.add(5);
        list.add(10);
        list.add(1,30);
        System.out.println(list);
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int num : list){
            System.out.println(num);
        }
       
    }
}