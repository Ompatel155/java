class student{
    String name;
    int rollNum;
    float marks;
        void display(){
            System.out.println("Name:"+" "+name);
            System.out.println("RollNum:"+" "+rollNum);
            System.out.println("Marks:"+" "+marks);
        }
}
public class studentprofile{
    public static void main(String[] args) {
        student s1=new student();
        s1.name="om patel";
        s1.rollNum=219;
        s1.marks=80.4f;
        student s2=new student();
        s2.name="raj bhadhwa";
        s2.rollNum=262;
        s2.marks=75f;
        s1.display();
        s2.display();
    }
}