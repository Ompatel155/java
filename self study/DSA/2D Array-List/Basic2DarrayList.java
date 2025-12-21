
import java.util.ArrayList;

class Basic2DarrayList{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
            ArrayList<Integer>list1=new ArrayList<>();
         list1.add(0);
         list1.add(1);
         list1.add(2);
         list1.add(3);

        ArrayList<Integer>list2=new ArrayList<>();
         list2.add(4);
         list2.add(5);
         list2.add(6);
         list2.add(7);

       ArrayList<Integer>list3=new ArrayList<>();
         list3.add(8);
         list3.add(9);
         list3.add(10);
         list3.add(11);
         
         list.add(list1);
         list.add(list2);
         list.add(list3);
         for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(i).get(j)+" ");
                }
                System.out.println();
            }
       
        }
            
         }
    
