package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoiNumeros() {
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num2 == 0 ? 0 : num1/num2;
    }

    public void imprimiDivideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("0");
        }else{
            System.out.println(num1/num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 1010;
        num2 = 1020;
        System.out.println("Metodo alteraDoisNumeros: num1: "+num1 +" num2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma+= num;
        }
        System.out.println(soma);
     }

     public void somaVarArgs(int... numeros){
         int soma = 0;
         for (int num : numeros) {
             soma+= num;
         }
         System.out.println(soma);
     }
}
