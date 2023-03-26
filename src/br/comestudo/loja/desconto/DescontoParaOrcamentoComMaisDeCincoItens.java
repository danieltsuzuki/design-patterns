package br.comestudo.loja.desconto;

import java.math.BigDecimal;

import br.comestudo.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{
	
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		

		return orcamento.getQuantidadeDeItens() > 5;
	}
	
}
