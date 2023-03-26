package br.comestudo.loja.desconto;

import java.math.BigDecimal;

import br.comestudo.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto{
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
}
