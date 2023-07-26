package situacao;

import java.math.BigDecimal;

import orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento){
		throw new DomainException("Orcamento nao pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento){
		throw new DomainException("Orcamento nao pode se reprovado");
	}
	
	public void finalizar(Orcamento orcamento){
		throw new DomainException("Orcamento nao pode se finalizado");
	}	

}
