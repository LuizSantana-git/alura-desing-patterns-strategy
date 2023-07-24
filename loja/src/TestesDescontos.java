import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import imposto.ICMS;
import imposto.ISS;
import loja.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
		System.out.println(calculadora.calcular(orcamento2));
	}
}
