package chainofresponsibility;

import java.math.BigDecimal;

public abstract class Desconto {
	
	protected Desconto desconto;
	
	public Desconto(Desconto proximo) {
		this.desconto = proximo;
	}
	
	public BigDecimal aplicador(Compra compra) {
		if(validaAplicacaoDesconto(compra)) {
			return calculaDesconto(compra);
		}
		return desconto.aplicador(compra);
	}

	public abstract BigDecimal calculaDesconto(Compra compra);
	public abstract boolean validaAplicacaoDesconto(Compra compra);
	

}
