package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/flavio/Projetos/Java-DeveDojo/arquivo/arquivo.txt");
        file.createNewFile();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
