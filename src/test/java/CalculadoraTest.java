import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void DeveriaSomarDoisNumerosPositivos() {

		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 5);

		Assert.assertEquals(8, soma);

	}

}
