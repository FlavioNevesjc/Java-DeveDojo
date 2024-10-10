package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Flávio","123456");
        //serializar(aluno);
        deserializar(aluno);
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void deserializar(Aluno aluno) {
        Path path = Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            aluno = (Aluno) ois.readObject();
        } catch (IOException| ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
