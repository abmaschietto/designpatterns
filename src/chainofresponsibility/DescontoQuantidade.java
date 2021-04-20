package chainofresponsibility;

import java.math.BigDecimal;

public class DescontoQuantidade extends Desconto {

	public DescontoQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calculaDesconto(Compra compra) {
		System.out.println("Desconto por quantidade");
		BigDecimal desconto = compra.getValor().multiply(new BigDecimal("0.2"));
		return desconto;
	}

	@Override
	public boolean validaAplicacaoDesconto(Compra compra) {
		return compra.getQtdVolumes() > 5;
	}

}
