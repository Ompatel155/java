
import java.util.*;

class BasicArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // 1st operation :  Add..(iska us aray me element add karne ke liye kiya jata hai)
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list);

        //  2nd operation : get element..(iska use array ke kisi ek element ko print karane ke liye kiya jata hai)
        int element =list.get(3);
       System.out.println(element);

       // 3rd  operation : add element in between..(isla use tab kiya jata hai jab array ke bich ko element insert karna hota hai)
       list.add(1,1);
       System.out.println(list);

    //    4th operation : set element..(iska use array me pahle se element ki value ko change karne ke liye kiya jata hai)
     list.set(0,5);
     System.out.println(list);

    //    5th operation :  Delete element..
    list.remove(4);
    System.out.println(list);

    //   6th operation : size pata karne ke liye
    int size=list.size();
    System.out.println(size);

    // loop kaise use karte hai Arraylist me 
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");

    }
    System.out.println();

    // Arraylist me sorting
    Collections.sort(list);
    System.out.println(list);

       }
    }