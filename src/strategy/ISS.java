package strategy;

import java.math.BigDecimal;

public class ISS implements Imposto{

	@Override
	public BigDecimal calculaImposto(Produto produto) {
		System.out.println("Calculando ISS");
		BigDecimal imposto = produto.getValor().multiply(new BigDecimal("0.05"));
		return imposto;
	}

}
