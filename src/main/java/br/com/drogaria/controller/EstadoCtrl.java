package br.com.drogaria.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.drogaria.dao.EstadoDao;
import br.com.drogaria.model.Estado;

@ManagedBean
@ViewScoped
public class EstadoCtrl implements Serializable {
	private static final long serialVersionUID = -8130590770956520254L;
	private Estado estado;
	
	private List <Estado> estados;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public List<Estado> getEstados() {
		return estados;
	}
	
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
	
	public void novo() {
		estado = new Estado();
	}

	public void salvar() {
		try {
			EstadoDao estadoDao = new EstadoDao();
			estadoDao.salvar(estado);
			MensagemSucesso();
			estados = estadoDao.listar();
		}catch(Throwable e) {
			MensagemErro("Ocorreu algum erro ao gravar o dado");
			e.printStackTrace();
		}	
	}
	
	@PostConstruct
	public void listar() {
		try {
			EstadoDao estadoDao = new EstadoDao();
			estados = estadoDao.listar();
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void MensagemSucesso() {
		String msg = "Nome : " + estado.getNome() + "   Sigla : " + estado.getSigla() +" Foram Salvos";
		FacesMessage ns = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, ns);
	}
	
	public void MensagemErro(String msg){
		FacesMessage ns = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, ns);
	}
}
