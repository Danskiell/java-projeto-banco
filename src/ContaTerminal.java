import java.util.Scanner;
public class ContaTerminal {
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Programa: Por favor, digite o numero de usuário!"); 
    int numero = scanner.nextInt();
    System.out.println("Usuario: " + numero);
    scanner.nextLine();
    System.out.println("Agora por favor digite a Agência!");
    String agenciaCliente = scanner.nextLine();
    System.out.println("Agência: " + agenciaCliente);
    
    System.out.println("Agora por favor digite seu nome!");
    String nomeCliente = scanner.nextLine();
    System.out.println("Nome: " + nomeCliente);
    
    System.out.println("Agora por favor digite o saldo da conta!");
    double saldoConta = scanner.nextDouble();
    System.out.println("Saldo: " + saldoConta);

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agenciaCliente + ", conta " + numero + " e seu saldo " + saldoConta + " já está disponivel para saque.");

    scanner.close();


}


}   