
import java.io.*;

class FileCreate{
    public static void main(String[] args) {
        try {
        File file=new File("home.html");
        if(file.createNewFile()){
        System.out.println("doneeeeee"+file.getName());
        }else{
            System.out.println("already file created");
        }
        } catch ( Exception e) {
            System.out.println(e);
        }
    }
}