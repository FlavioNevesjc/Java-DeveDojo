package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+(fim - inicio) + "ms");

        // StringBuilder
        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+(fim - inicio) + "ms");

        // StringBuffer
        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+(fim - inicio) + "ms");

    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0;  i <tamanho; i++){
            texto += i; // 0, 01, 02 ,03 , 04
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0;  i <tamanho; i++){
            sb.append(i); // 0, 01, 02 ,03 , 04
        }
    }


    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0;  i <tamanho; i++){
            sb.append(i); // 0, 01, 02 ,03 , 04
        }
    }
}
