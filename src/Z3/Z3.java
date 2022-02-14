import java.io.File;
import java.io.FileFilter;

public class Z3 {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users");
            String[] filter = file.list((file1,s ) -> file.isDirectory());
            for (String i:filter){
                System.out.println(i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
