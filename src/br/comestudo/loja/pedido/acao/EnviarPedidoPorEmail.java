package br.comestudo.loja.pedido.acao;

import br.comestudo.loja.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido...");
	}

}