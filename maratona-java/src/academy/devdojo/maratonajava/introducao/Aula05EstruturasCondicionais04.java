package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Imposto sobre o Salario Anaul
        // 0       -    34,712 = 9.70%
        // 34,713  -    68,507 = 37.35%
        // 68,508  -           = 49.50%

        double salarioAnual = 70000;
        if (salarioAnual < 34712) {
            System.out.println("taxa 9.7% ou valor de " + salarioAnual*0.097);
        } else if (salarioAnual > 34713 && salarioAnual < 68507) {
            System.out.println("taxa 37.35% ou valor de " + salarioAnual*0.3735);
        } else {
            System.out.println("taxa 49,50% ou valor de " + salarioAnual*0.4950);
        }
    }
}
