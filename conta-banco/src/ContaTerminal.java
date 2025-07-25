import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrance = new Scanner (System.in);

        System.out.println("Qual é o seu nome?");
        String name = entrance.nextLine();
        
        System.out.println("Olá, " + name +"! Sou o Atendente Virtual do DIOBANK. Vamos abrir sua conta.");

        System.out.println("Qual é a sua renda mensal");
        double income = entrance.nextDouble();

        int account = 1021;
        String agency = "067-8";
    
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo " + income + " já está disponível para saque.");
    }
}
