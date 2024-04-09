package academy.devdojo.maratonajava.javacore.Fmodificdorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a jvm carregar classe
    // 1 - Alocado espaço em memoria por objeto
    // 2 - Cada atributo de classe é criado e inicializado com valor default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Contrutor é executado
    static {
        System.out.println("Dentro do bloco de inicialização estatico 1");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for(int episodio : episodios){
            System.out.print(episodio + " ");
        }
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
