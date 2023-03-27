package br.comestudo.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.comestudo.loja.pedido.GeraPedido;
import br.comestudo.loja.pedido.GeraPedidoHandler;
import br.comestudo.loja.pedido.acao.CriarPedidoNoBanco;
import br.comestudo.loja.pedido.acao.EnviarPedidoPorEmail;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executar(gerador);
	}

}