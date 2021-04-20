package chainofresponsibility;

import java.math.BigDecimal;

public class Compra {

	private String produto;
	private Integer qtdVolumes;
	private BigDecimal valor;

	public Compra(String produto, Integer qtdVolumes, BigDecimal valor) {
		super();
		this.produto = produto;
		this.qtdVolumes = qtdVolumes;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Integer getQtdVolumes() {
		return qtdVolumes;
	}

	public void setQtdVolumes(Integer qtdVolumes) {
		this.qtdVolumes = qtdVolumes;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Compra [produto=" + produto + ", qtdVolumes=" + qtdVolumes + ", valor=" + valor + "]";
	}

}
