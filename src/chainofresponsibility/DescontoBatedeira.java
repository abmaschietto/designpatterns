package chainofresponsibility;

import java.math.BigDecimal;

public class DescontoBatedeira extends Desconto{

	public DescontoBatedeira(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calculaDesconto(Compra compra) {
		System.out.println("Desconto exclusivo batedeira!");
		BigDecimal desconto = compra.getValor().multiply(new BigDecimal("0.2"));
		return desconto;
	}

	@Override
	public boolean validaAplicacaoDesconto(Compra compra) {
		return compra.getProduto().toLowerCase().equals("batedeira");
	}

}
