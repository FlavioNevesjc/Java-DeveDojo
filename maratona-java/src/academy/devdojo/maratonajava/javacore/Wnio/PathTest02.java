package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
            Files.createDirectories(pastaPath);
            Path subPastaPath = Paths.get(String.valueOf(pastaPath),"subpasta","subpasta","subpasta");
            Files.createDirectories((subPastaPath));
        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");
        if (Files.notExists(pastaPath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

    }
}
