package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >=1000
        double valorCarroNovo = 30000;
        for (int parcelas = 1; parcelas < valorCarroNovo; parcelas++) {
            double valorParcelas = valorCarroNovo / parcelas;
            if (valorParcelas >= 1000) {
                System.out.println("Parcela: " + parcelas + " - R$ " + valorParcelas);
            } else {
                break;
            }
        }
    }
;}
