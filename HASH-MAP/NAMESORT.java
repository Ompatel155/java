
import java.lang.reflect.Array;
import java.util.*;

class student {
    String name;
    int Rollno;
    public student(int Rollno,String name){
        this.name = name;
        this.Rollno=Rollno;
    }
}
class NameSorted implements Comparator<student>{
    public int compare(student s1,student s2){
        return s1.name.compareTo(s2.name);
    }
}
class NAMESORT{
    public static void main(String[] args) {
        ArrayList<student> list =new ArrayList<>();
        list.add(new student(1,"om"));
        list.add(new student(4,"ankit"));
Collections.sort(list,new NameSorted());
for(student s: list){
    System.out.println(s.Rollno+ " "+s.name);
}
    }

}