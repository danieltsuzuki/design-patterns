package br.comestudo.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.comestudo.loja.DomainException;
import br.comestudo.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
