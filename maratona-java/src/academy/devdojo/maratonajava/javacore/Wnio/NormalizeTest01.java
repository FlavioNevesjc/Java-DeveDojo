package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/flavio/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto,arquivoTxt);
        System.out.println(path1);
        System.out.println("Com Normalize: "+ path1.normalize());

        Path path2 = Paths.get("/home/./william/./dev/");
        System.out.println(path2);
        System.out.println("Com Normalize: "+ path2.normalize());
    }
}
