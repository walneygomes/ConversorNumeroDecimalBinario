package conversaoNumeroBinario;

import java.util.Scanner;

public class ProgramBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorNumero c = new ConversorNumero();
		Scanner sr = new Scanner(System.in);
		System.out.printf("O NUMERO DECIMAL(10) SERA CONVERTIDO PARA BINATIO(2) %n");
		int numero = sr.nextInt();
		c.setNumero(numero);
		System.out.print(c.converterNumero());
	}

}
