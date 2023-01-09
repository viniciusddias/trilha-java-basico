package operadores;
public class Operadores {
    
    public static void main(String[] args) {
       
        String nomeCompleto = "LINGUAGEM " + "JAVA";
            System.out.println(nomeCompleto);

            String concatenacao = "?";

        concatenacao = 3+3+3+"3";
            System.out.println(concatenacao);

        concatenacao = 3+"3"+3+3;
            System.out.println(concatenacao);
        
        concatenacao = 3+"3"+3+3+"3";
            System.out.println(concatenacao);

        concatenacao = "3"+3+3+3;
            System.out.println(concatenacao);

        concatenacao = "3"+(3+3+3);
            System.out.println(concatenacao);
    }
}
