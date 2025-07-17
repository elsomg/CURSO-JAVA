import java.io.File;
import java.util.Arrays;


public class fileSystem1 {
    static void listFiles(String pathName) {
        File file = new File(pathName);
        String[] list = file.list();
        for (String element : list) {
            char Type = getType(pathName + " / " + element);
            System.out.println(type + " " + element);
        }
        

    }

    static char getType(String pathName) {
        File file = new File(pathName);
        return file.isDirectory() ? "D" : "F";
    }
   

    public static void main(String[] args) {
        String pathName = "demo-persis/resources";
        listFiles(pathName);
    }
}
