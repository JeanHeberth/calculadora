
public class CalculadoraTeste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		int soma = calc.somar(5, 8);
		System.out.println("O resultado é: " + soma);

		int subtracao = calc.diminuir(10, 20);
		System.out.println("O resultado é: " + subtracao);

		int multiplicacao = calc.multiplicar(10, 5);
		System.out.println("O resultado é: " + multiplicacao);

		int divisao = calc.dividir(10, 5);
		System.out.println("O resultado é: " + divisao);
	}

}
