package variaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Estudar 
        // Tipos primitivos
        // As classes String que representa texto dentro de nassas aplicações

        double salarioMinimo = 2500;

        short numeroCorto = 1;
        int numeroNormal = numeroCorto;
        short numeroCorto2 = (short) numeroNormal;


        int numero = 5;

        numero = 10;

        System.out.print(numero);


        // Essa declaração de variável não pode ter seu valor
        // auterado.
        final double VALOR_DE_PI = 3.14;
    }
}
