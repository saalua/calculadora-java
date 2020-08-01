package br.com.serratec.calculadora;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.setOperacao(1);
		
		System.out.println("Digite o primeiro valor: ");
		Scanner sc = new Scanner(System.in);
		calculadora.setValor1(sc.nextDouble());
		
		System.out.println();
		
		System.out.println("Digite o segundo valor: ");
		Scanner sc2 = new Scanner(System.in);
		calculadora.setValor2(sc2.nextDouble());
		System.out.println();
		
		System.out.println();
		System.out.println(calculadora);
		System.out.println();
		
		
		while (calculadora.getOperacao() > 0) {
			if(calculadora.getOperacao() == 5) {
				break;
			} else {
				System.out.println();
				System.out.println("Digite o número correspondente a operação desejada: ");
				System.out.println("1 - SOMAR ");
				System.out.println("2 - SUBTRAIR ");
				System.out.println("3 -MULTIPLICAR ");
				System.out.println("4 - DIVIDIR ");
				System.out.println("5 - SAIR ");
				Scanner sc3 = new Scanner(System.in);
				calculadora.setOperacao(sc3.nextInt());
				System.out.println();
				calculadora.calcular();
			}
		}
		
	}
}
