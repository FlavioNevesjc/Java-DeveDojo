package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 0;
        switch (dia) {
            case 1:{
                System.out.println("Domingo'é Feriado");
                break;
            }
            case 2: {
                System.out.println("Segunda");
                break;
            }
            case 3: {
                System.out.println("Terça");
                break;
            }
            case 4:{
                System.out.println("Quarta");
                break;
            }
            case 5: {
                System.out.println("Quinta");
                break;
            }
            case 6: {
                System.out.println("Sexta");
                break;
            }
            case 7: {
                System.out.println("Sabado é Feriado");
                break;
            }
            default: {
                System.out.println("Data invalida");
                break;
            }
        }
    }
}
