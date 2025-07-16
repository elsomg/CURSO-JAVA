package demos.ejercicios;

import java.io.File;

public class borrarcarpeta {
public static void metod(File index){
String[] deletefolder = index.list();
for (String delete : deletefolder) {
    File currentFile = new File(index.getPath(), delete);
    currentFile.delete();
}
    }
    
    public static void main(String[] args) {
        metod(null);
    }
}

