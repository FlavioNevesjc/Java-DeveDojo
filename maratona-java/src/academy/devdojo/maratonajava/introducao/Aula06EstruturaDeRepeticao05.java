package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >=1000
        double valorCarroNovo = 30000;
        for (int parcelas = (int) valorCarroNovo; parcelas >= 1 ; parcelas--) {
            double valorParcelas = valorCarroNovo / parcelas;
            if (valorParcelas < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcelas + " - R$ " + valorParcelas);
        }
    }
}
