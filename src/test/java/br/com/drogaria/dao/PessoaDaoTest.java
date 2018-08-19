package br.com.drogaria.dao;

import org.junit.Test;

import br.com.drogaria.model.Cidade;
import br.com.drogaria.model.Pessoa;

public class PessoaDaoTest {
	@Test
	public void salvar() {
		Long codigoCidade = 1l;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(codigoCidade);
		
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Eunice Alves de Melo");
		pessoa.setCpf("000");
		pessoa.setRg("45215");
		pessoa.setEmail("euniceao@gmail.com");
		pessoa.setTelefone("(62)3256-3028");
		pessoa.setCelular("(62)98225-4485");
		pessoa.setRua("Flemmington");
		pessoa.setBairro("Vila Alpes");
		pessoa.setNumero(new Short("50"));
		pessoa.setComplemento("Edificio manhattan 2 bloco A apartamente 1207");
		pessoa.setCidade(cidade);
		pessoaDao.salvar(pessoa);
	}
}
