package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodio;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String tipo, int episodio, String nome, String genero){
        this();
        this.tipo = tipo;
        this.episodio = episodio;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String tipo, int episodio, String nome, String genero, String estudio){
        this(tipo, episodio, nome, genero);
        this.estudio = estudio;
    }

    public Anime(){
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodio(int episodio){
        this.episodio = episodio;
    }

    public int getEpisodio(){
        return this.episodio;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
