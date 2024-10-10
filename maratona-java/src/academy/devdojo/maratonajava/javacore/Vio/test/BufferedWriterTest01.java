package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/flavio/Projetos/Java-DeveDojo/arquivo/arquivo.txt");
        file.createNewFile();
        try (FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é Lindo... é o melhor curso do Brasil!!!!!");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
