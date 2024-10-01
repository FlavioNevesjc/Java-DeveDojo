package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/flavio/Projetos/Java-DeveDojo/arquivo/file.txt");
        try {

            if (file.exists()){
                System.out.println("Last Modified "+ new Date(file.lastModified()));
                boolean isDelete = file.delete();
                System.out.println("Apagado " + isDelete);


            } else  {
                boolean isCreated = file.createNewFile();
                System.out.println("Criado " + isCreated);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
