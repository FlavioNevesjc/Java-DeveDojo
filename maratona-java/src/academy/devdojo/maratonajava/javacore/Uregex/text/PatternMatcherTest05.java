package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não é digito
        // \s = Espaços em Branco
        // \S = todos os caracteres excluidos ou não brancos
        // \w = a-z A-Z digitos
        // \W = Tudo que não diferente de \w

        String regex = "([a-zA-Z0-9\\.-_])+@([a-z])+(\\.([a-z])+)+";
     //   String texto = "abaaaba";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posiçoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }
    }

}
