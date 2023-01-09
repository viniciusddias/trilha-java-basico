public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "VINICIUS";
        String nomeDois = new String("VINICIUS"); // um novo objeto/string

        System.out.println(nomeUm.equals(nomeDois)); // equals usamos em objetos e string.




        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }
        
        System.out.println("numeroUm é igual numoroDois? " + simNao);

        simNao = numero1 != numero2;
        
        System.out.println("numeroUm é igual numoroDois? " + simNao);

        simNao = numero1 > numero2;
        
        System.out.println("numeroUm é igual numoroDois? " + simNao);
    }
}
