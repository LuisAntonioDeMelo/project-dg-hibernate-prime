package br.com.drogaria.dao;

import org.junit.Test;

import br.com.drogaria.model.Cliente;
import br.com.drogaria.model.Funcionario;
import br.com.drogaria.model.Venda;

public class VendaDaoTest {
	@Test
	public void salvar() {
		VendaDao vendaDao = new VendaDao();	
		Venda venda = new Venda();
		//venda.setValorTotal("");
		//venda.setHorario("");
		
		
		//-- pegando o objeto correto
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario  = funcionarioDao.buscar(new Long(""));
		
		//--- pegando o objeto correto
		ClienteDao clienteDao = new ClienteDao();
		Cliente cliente = clienteDao.buscar(new Long(" "));
		
		//necessário pesquisar esses objetos e verificar se nao sao nulos
		venda.setFuncionario(funcionario);
		venda.setCliente(cliente);
		
	}
}
