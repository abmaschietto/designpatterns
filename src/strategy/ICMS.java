package strategy;

import java.math.BigDecimal;

public class ICMS implements Imposto{

	@Override
	public BigDecimal calculaImposto(Produto produto) {
		System.out.println("Calculando ICMS");
		BigDecimal imposto = produto.getValor().multiply(new BigDecimal("0.1"));
		return imposto;
	}

}
