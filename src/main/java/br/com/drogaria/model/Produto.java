package br.com.drogaria.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto extends GenericDomain{

	private static final long serialVersionUID = 3622157848057447742L;

	@Column(length = 80, nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Short quantidaede;
	
	@Column(nullable=false, precision =6 , scale=2)
	private BigDecimal preco;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Short getQuantidaede() {
		return quantidaede;
	}

	public void setQuantidaede(Short quantidaede) {
		this.quantidaede = quantidaede;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@ManyToOne
	@JoinColumn(nullable=false)
	private Fabricante fabricante;
	
	
}
