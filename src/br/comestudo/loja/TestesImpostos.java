package br.comestudo.loja;

import java.math.BigDecimal;

import br.comestudo.loja.imposto.CalculadoraDeImpostos;
import br.comestudo.loja.imposto.ISS;
import br.comestudo.loja.orcamento.Orcamento;

public class TestesImpostos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		
	}
	
}
