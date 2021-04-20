package strategy;

import java.math.BigDecimal;

public class CalculadoraImposto {
	
	public BigDecimal calculaImpsoto(Produto produto, Imposto imposto) {
		return imposto.calculaImposto(produto);
	}

}
