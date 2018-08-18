package br.com.drogaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pessoa extends GenericDomain {

	private static final long serialVersionUID = -6280845588219102342L;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 15, nullable = false)
	private String cpf;
	
	@Column(length = 20, nullable = false)
	private String rg;
	
	@Column(length = 50, nullable = false)
	private String rua;
	
	@Column(length = 10)
	private Short numero;
	
	@Column(length = 50, nullable = false)
	private String bairro;
	
	@Column(length = 50, nullable = false)
	private String complemento;
	
	@Column(length = 15, nullable = false)
	private String telefone;
	
	@Column(length = 15, nullable = false)
	private String celular;
	
	@Column(length = 20, nullable = false)
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Short getNumero() {
		return numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

}
