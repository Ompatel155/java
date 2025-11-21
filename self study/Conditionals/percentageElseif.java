
import java.util.Scanner;

class percentageElseif{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the percentage : ");
float p=sc.nextFloat();
if(p>90){
System.out.println("Excellent......!");
}
else if(p>80){
    System.out.println("Very Good......!");
}
else if(p>70){
    System.out.println("Good.....!");
}
else if(p>60){
    System.out.println("Can do better.....!");
}
else if(p>50){
    System.out.println("Average......!");
}
else if(p>40){
    System.out.println("Below Average.....!");
}
else{
    System.out.println("Fail......");
}
    }
}
