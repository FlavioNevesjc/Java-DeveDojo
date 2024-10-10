package academy.devdojo.maratonajava.javacore.Wnio;

import javax.sound.midi.Soundbank;
import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/file.bkp");
        Path path2 = Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/file.txt");
        Path path3 = Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/file.java");
        Path path4 = Paths.get("/home/flavio/Projetos/Java-DeveDojo/");

        matches(path1,"glob:*.bkp");
        matches(path1,"glob:**.bkp");
        matches(path1,"glob:**/*.bkp");
        matches(path1,"glob:**/*.{bkp,java,txt}");
        matches(path2,"glob:**/*.{bkp,java,txt}");
        matches(path3,"glob:**/*.{bkp,java,txt}");
        matches(path2,"glob:**/*.{???}");
        matches(path3,"glob:**/*.{???}");
        matches(path3,"glob:**/file.????");

    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
