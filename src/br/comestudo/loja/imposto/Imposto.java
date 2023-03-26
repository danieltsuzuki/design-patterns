
package br.comestudo.loja.imposto;

import java.math.BigDecimal;

import br.comestudo.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
