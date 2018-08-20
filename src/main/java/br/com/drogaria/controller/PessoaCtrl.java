package br.com.drogaria.controller;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

import br.com.drogaria.dao.CidadeDao;
import br.com.drogaria.dao.PessoaDao;
import br.com.drogaria.model.Cidade;
import br.com.drogaria.model.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaCtrl implements Serializable {
	
	private static final long serialVersionUID = -6353642049308508185L;
	private Pessoa pessoa;
	private List <Pessoa> pessoas;
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
//	@PostConstruct
//	public void init() {
//		System.out.println("inicia esse objeto tbm");
//		pessoa = new Pessoa();
//	}
	

	
	@PostConstruct
	public void listar() {	
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(4l);
		PessoaDao pessoaDao = new PessoaDao();
		pessoas = pessoaDao.listar();
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getNome());
		}
		System.out.println("Listado");
	}
	
	public void adicionar() {
		System.out.println("estou sendo salvo");
	}
	
}
