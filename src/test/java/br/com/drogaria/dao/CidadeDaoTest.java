package br.com.drogaria.dao;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.model.Cidade;
import br.com.drogaria.model.Estado;

public class CidadeDaoTest {
	
	@Test
	@Ignore
	public void salvar() {
		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(4l);
		if(estado != null) {
			CidadeDao cidadeDao = new CidadeDao();
			Cidade cidade = new Cidade();
			cidade.setNome("Palmeiras de Goiás");

			cidade.setEstado(estado);
			cidadeDao.salvar(cidade);
			System.out.println(estado.getNome() +" - " + cidade.getNome());
			
		}else {
			System.out.println("Estado não encontrado!");
		}
		
	}
	
	
	@Test
	@Ignore
	public void listar() {
		CidadeDao cidadeDao = new CidadeDao();
		List <Cidade> cidades = cidadeDao.listar();
		
		
	}
	@Test
	@Ignore
	public void buscar() {
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(8l);
		
		System.out.println(cidade.getNome());
		System.out.println(cidade.getEstado().getNome());
	}
	
	@Test
	@Ignore
	public void excluir() {
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(8l);
		cidadeDao.excluir(cidade);
	}
	
	@Test
	public void editar() {
		
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(7l);
		System.out.println("cidade:atual -"+ cidade.getNome());
		System.out.println("irei editar cidade");
		
		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(2l);
		System.out.println("busquei o estado!!");
		System.out.println(estado.getNome());
		System.out.println("Editando a cidade");
		cidade.setNome("Niteroi");
		cidade.setEstado(estado);
		cidadeDao.atualizar(cidade);
		
	
		
		
		
	}
}
