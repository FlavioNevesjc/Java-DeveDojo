package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.Instant;

import static java.time.Instant.*;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instante = now();
        System.out.println(instante);

        System.out.println(ofEpochSecond(3));
        System.out.println(ofEpochMilli(1_000_000_000));
    }
}
