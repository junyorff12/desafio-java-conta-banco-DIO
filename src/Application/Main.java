package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Por favor digite o numero da Agencia: ");
		String agencia = sc.nextLine();
				
		System.out.println("Por favor digite o numero da conta: ");
		int contaNumero = sc.nextInt();		
		
		System.out.println("Por favor digite o saldo: ");
		double saldo = sc.nextDouble();	
				
		Conta conta  = new Conta(contaNumero, agencia, nome, saldo);
		
		System.out.println(conta);
		
		sc.close();
	}

}
