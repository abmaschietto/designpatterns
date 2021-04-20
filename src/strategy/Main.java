package strategy;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Produto produtoICMS = new Produto("Britadeiras", new BigDecimal(5000));
		Produto produtoISS = new Produto("Caminhões", new BigDecimal(5000));
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		System.out.println(calculadoraImposto.calculaImpsoto(produtoICMS, new ICMS()));
		System.out.println(calculadoraImposto.calculaImpsoto(produtoISS, new ISS()));
	}
}
