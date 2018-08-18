package br.com.drogaria.util;

import java.util.List;

import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.EstadoDao;
import br.com.drogaria.model.Estado;

public class HibernateUtilTest {
	@Test
	@Ignore
	public void connectar() {
		Session sessao = HibernateUtil.getSession().openSession();
		System.out.println(sessao);
		sessao.close();
		HibernateUtil.getSession().close();
	}
	
	


}
