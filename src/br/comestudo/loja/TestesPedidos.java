package br.comestudo.loja;

import java.math.BigDecimal;

import br.comestudo.loja.pedido.GeraPedido;
import br.comestudo.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.executar(gerador);
	}

}