package br.com.serratec.calculadora;

public class Calculadora {

	private double valor1; 
	private double valor2;
	private double total;
	private int operacao;
	
	
	@Override
	public String toString() {
		return "Calculadora [Primeiro número = " + valor1 + ", Segundo número = " + valor2 + "]";
	}

	
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
		
	}

	
	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getOperacao() {
		return operacao;
	}


	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}



	//MÉTODOS PARA CALCULAR AS OPERAÇÕES
	public double somarNumeros() {
		total = valor1 + valor2;
		return total;
	}
	
	public double subtrairNumeros() {
		total = valor1 - valor2;
		return total;
	}
	
	public double multiplicarNumeros() {
		total = valor1 * valor2;
		return total;
	}
	
	public double dividirNumeros() {
		total = valor1 / valor2;
		return total;
	}
	
	
	public void calcular() {

		if (this.operacao == 1) {
			this.somarNumeros();
			System.out.println("Resultado: " + this.total);
		} else if (this.operacao == 2) {
			this.subtrairNumeros();
			System.out.println("Resultado: " + this.total);
		} else if (this.operacao == 3) {
			this.multiplicarNumeros();
			System.out.println("Resultado: " + this.total);
		} else if (this.operacao == 4) {
			this.dividirNumeros();
			System.out.println("Resultado: " + this.total);
		} else if (this.operacao == 5){
			System.out.print("SAINDO... OBRIGADA POR UTILIZAR NOSSA CALCULADORA, ATÉ A PRÓXIMA!! ");
		} else {
			System.out.print("NÚMERO INVÁLIDO");
			System.out.println();
		}
	}
		
}
