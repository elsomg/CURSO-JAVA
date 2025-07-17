package demos.ejercicios;

import java.io.File;
class DeleteDirectory {

    public static void deleteDirectory(File file)
    {
        for (File subfile : file.listFiles()) {
            if (subfile.isDirectory()) {
                deleteDirectory(subfile);
            }
            subfile.delete();
        }
    }

    public static void main(String[] args)
    {

        String filepath = "C:\\prueba";
        File file = new File(filepath);
        deleteDirectory(file);

      
        file.delete();
    }
}

