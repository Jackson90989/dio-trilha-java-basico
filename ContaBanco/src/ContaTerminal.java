import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println(" \n Por favor, Digite seu numero do banco:");
        int numero = scanner.nextInt();

        System.out.println("\n Por favor, Digite o número de sua Agência:");
        int agencia = scanner.nextInt();

        System.out.println("\n Por favor, Digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("\n Por favor, Digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println(" \n Olá  " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para o saque ");

}

}