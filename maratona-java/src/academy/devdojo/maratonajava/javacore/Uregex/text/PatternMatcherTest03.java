package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não é digito
        // \s = Espaços em Branco
        // \S = todos os caracteres excluidos ou não brancos
        // \w = a-z A-Z digitos
        // \W = Tudo que não diferente de \w

        String regex = "\\w";
     //   String texto = "abaaaba";
        String texto = "a @Sd.0i9!#aba";
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
