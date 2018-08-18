package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.model.Estado;
import br.com.drogaria.dao.EstadoDao;

public class EstadoDaoTest {
	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Pernambuco");
		estado.setSigla("PE");
		
		EstadoDao estadoDao = new EstadoDao();
		estadoDao.salvar(estado);
		
	}
	
	@Test
	@Ignore
	public void listar() {
		EstadoDao estadoDao = new EstadoDao();
		List<Estado>listar =estadoDao.listar();
		for(Estado estado : listar) {
			System.out.println("Nome : "+estado.getNome()+" Sigla : "+ estado.getSigla());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long id = 2l;
		EstadoDao est = new EstadoDao();
		Estado estado = est.buscar(id);
		System.out.println(estado.getSigla());
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long id = 36l;
		EstadoDao estadoDao = new EstadoDao();
		Estado deleteEstado = estadoDao.buscar(id);
		if(deleteEstado != null) {
			estadoDao.excluir(deleteEstado);
		}else {
			System.out.println("Estado nao existe");
		}

	}
	
	@Test
	public void editar() {
		Long id = 5l;
		EstadoDao  estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(id);
		estado.setNome("Amapá");
		estado.setSigla("AM");
		estadoDao.atualizar(estado);
		
	}
	
	
}
