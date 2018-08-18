package br.com.drogaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Usuario extends GenericDomain {

	private static final long serialVersionUID = -8458004190698407236L;
	
	@Column(length= 32, nullable= false)
	private String senha;
	
	@Column(length=1,nullable=false)
	private Character tipo;
	
	@Column(nullable=false)
	private Boolean ativo;
	
	@OneToOne
	@JoinColumn(nullable= false)
	private Pessoa pessoa;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
