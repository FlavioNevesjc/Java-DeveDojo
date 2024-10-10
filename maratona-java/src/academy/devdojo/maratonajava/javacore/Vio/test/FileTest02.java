package academy.devdojo.maratonajava.javacore.Vio.test;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("/home/flavio/Projetos/Java-DeveDojo/arquivo/Pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileDiretorio.getPath() + "/arquivoPasta.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated );

        File fileRenamed = new File (fileDiretorio,"ArquivoR.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("/home/flavio/Projetos/Java-DeveDojo/arquivo/","pasta2");
        boolean isDiretorioRenomado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenomado);
    }
}
