package chainofresponsibility;

import java.math.BigDecimal;

public class CalculadorDesconto {
	
	public BigDecimal calculaDesconto(Compra compra) {
		Desconto desconto = new DescontoQuantidade(new DescontoValor(new DescontoBatedeira(new DescontoFinal())));
		return desconto.aplicador(compra);
	}

}
