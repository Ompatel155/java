
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int Rollno;
    public Student(int Rollno,String name){
        this.name=name;
        this.Rollno=Rollno;
    }
    public int compareTo(Student s1){
        return this.Rollno-s1.Rollno;
    }
    public String toString(){
        return Rollno+" "+name;
    }
}
class studentArrayList{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(11, "om"));
        list.add(new Student(2, "Raunak"));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}