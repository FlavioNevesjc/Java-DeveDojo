package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneList01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1abc1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Samsung");
        Smartphone s3 = new Smartphone("33333", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222111", "Pixel");
        System.out.println(smartphones.contains(s4));
        int indexS4 = smartphones.indexOf(s4); // caso não exista o item, a resposta é -1
        System.out.println(indexS4);
        System.out.println(smartphones.get(0).getSerialNumber());
    }
}
