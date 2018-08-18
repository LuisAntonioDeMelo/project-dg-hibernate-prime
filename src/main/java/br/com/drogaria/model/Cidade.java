package br.com.drogaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity 
public class Cidade extends GenericDomain{
	private static final long serialVersionUID = -7889960647935017005L;
	@Column(length=50, nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable= false)
	private Estado estado;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

}
