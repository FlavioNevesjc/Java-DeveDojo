package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // não tem necessidade de deixar public pois ele já é public do default
    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
