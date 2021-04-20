package chainofresponsibility;

import java.math.BigDecimal;

public class DescontoValor extends Desconto {

	public DescontoValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calculaDesconto(Compra compra) {
		System.out.println("Desconto por valor");
		BigDecimal desconto = compra.getValor().multiply(new BigDecimal("0.1"));
		return desconto;
	}

	@Override
	public boolean validaAplicacaoDesconto(Compra compra) {
		return compra.getValor().compareTo(new BigDecimal(1000)) > 0;
	}

}
