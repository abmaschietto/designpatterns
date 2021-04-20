package chainofresponsibility;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		CalculadorDesconto calduladora = new CalculadorDesconto();
		Compra descontoValor = new Compra("Camisetas", 4, new BigDecimal(1001));
		Compra descontoQtd = new Compra("Meias", 15, new BigDecimal(300));
		Compra semDesconto = new Compra("Meias", 5, new BigDecimal(300));
		Compra descontoBatedeira = new Compra("BatEdeira", 5, new BigDecimal(200));
		System.out.println(calduladora.calculaDesconto(descontoValor));
		System.out.println(calduladora.calculaDesconto(descontoQtd));
		System.out.println(calduladora.calculaDesconto(semDesconto));
		System.out.println(calduladora.calculaDesconto(descontoBatedeira));
	}

}
