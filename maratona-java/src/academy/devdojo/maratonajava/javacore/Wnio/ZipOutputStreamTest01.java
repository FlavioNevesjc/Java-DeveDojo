package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("arquivo/arquivo.zip");
        Path arquivoParaZipar = Paths.get("arquivo/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivoParaZipar);

    }
    private static void zip(Path arquivoZip, Path arquivoParaZip){
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZip)){
            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
