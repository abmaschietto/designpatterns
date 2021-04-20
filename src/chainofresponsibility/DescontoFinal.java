package chainofresponsibility;

import java.math.BigDecimal;

public class DescontoFinal extends Desconto {

	public DescontoFinal() {
		super(null);
	}

	@Override
	public BigDecimal calculaDesconto(Compra compra) {
		System.out.println("Nenhum desconto aplicado");
		return BigDecimal.ZERO;
	}

	@Override
	public boolean validaAplicacaoDesconto(Compra compra) {
		return true;
	}

}
