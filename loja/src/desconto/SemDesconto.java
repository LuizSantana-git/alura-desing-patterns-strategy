package desconto;

import java.math.BigDecimal;

import loja.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		return BigDecimal.ZERO;
	}

}
