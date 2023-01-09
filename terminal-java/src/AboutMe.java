public class AboutMe {
    public static void main(String[] args) {

        String nome = args [0];
        String sobrinome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Me chamo " + nome + " " + sobrinome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Altura é " + altura + "cm");

    }
}
