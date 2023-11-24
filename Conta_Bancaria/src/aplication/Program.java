package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Insira o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Insira o nome do Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Sua conta tem deposito inicial (y / n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.print("Informe o valo do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(number, titular,depositoInicial);
		} else {
			conta = new Conta(number, titular);
		}
		
		System.out.println();
		System.out.println("------- Dados da conta -------");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Digite o valor que deseja depositar: ");
		double depositoValor = sc.nextDouble();
		conta.deposito(depositoValor);
		System.out.println("-------- Novos dados na conta -------");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Digite o valor que deseja sacar: ");
		double saqueValor = sc.nextDouble();
		conta.saque(saqueValor);
		System.out.println("-------- Novos dados na conta -------");
		System.out.print(conta);
		
		
		
		sc.close();

	}

}
