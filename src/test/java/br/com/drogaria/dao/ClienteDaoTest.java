package br.com.drogaria.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.model.Cliente;
import br.com.drogaria.model.Pessoa;

public class ClienteDaoTest {
	@Test
	public void salvar(){
		Cliente cliente = new Cliente();
		cliente.setDataDoCadastro(new Date());
		
		PessoaDao pessaoDao = new PessoaDao();
		Pessoa pessoa = pessaoDao.buscar(17l);
		cliente.setPessoa(pessoa);
		cliente.setLiberado(true);

		ClienteDao clienteDao = new ClienteDao();
		clienteDao.salvar(cliente);
	}
	@Test
	public void listar() {
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes = clienteDao.listar();
		
		for(Cliente cliente : clientes) {
			System.out.println("ID :"+ cliente.getCodigo());
			System.out.println("Nome " + cliente.getPessoa().getNome());
			System.out.println(""+ cliente.getDataDoCadastro());
		}
	}
	@Test
	@Ignore
	public void excluir() {
		ClienteDao clienteDao = new ClienteDao();
		Cliente clientedel = clienteDao.buscar(18l);
		clienteDao.excluir(clientedel);
	}
	
}
