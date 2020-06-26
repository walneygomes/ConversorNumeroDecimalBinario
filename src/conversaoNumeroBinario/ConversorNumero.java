package conversaoNumeroBinario;

public class ConversorNumero {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public StringBuffer converterNumero() {
		String binario;
		binario = "";
		while (true) {

			binario += Integer.toString(this.restoDo(this.restoDo(this.numero)));

			this.numero = this.numeroDividir(this.getNumero());
			if (this.getNumero() == this.numeroDividir(this.getNumero())) {
				break;
			}

		}
		return new StringBuffer(binario).reverse();

	}

	private int numeroDividir(int numero) {

		return numero / 2;

	}

	private int restoDo(int numero) {
		return numero % 2;
	}

}
