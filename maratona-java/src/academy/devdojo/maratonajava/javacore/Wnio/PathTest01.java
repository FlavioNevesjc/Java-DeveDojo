package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/arquivo.txt");
        Path path2 = Paths.get("home","flavio/Projetos/Java-DeveDojo/arquivo","arquivo.txt");
        Path path3 = Paths.get("home","flavio","Projetos","Java-DeveDojo","arquivo","arquivo.txt");

        System.out.println(path1.getFileName());
        System.out.println(path2.getRoot());
        System.out.println(path3.getParent());

    }
}
