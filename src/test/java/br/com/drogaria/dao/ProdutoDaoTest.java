package br.com.drogaria.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.drogaria.model.Fabricante;
import br.com.drogaria.model.Produto;

public class ProdutoDaoTest {
	@Test
	public void salvar() {
		Long codigoFabricante = 1l;
		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(codigoFabricante);
		
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = new Produto();
		produto.setDescricao("Clonazepam 2mg");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("81.90"));
		produto.setQuantidaede(new Short("7"));
		produtoDao.salvar(produto);
		
	}
}
