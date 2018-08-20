package br.com.drogaria.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.drogaria.util.HibernateUtil;

public class GenericDao <T> {
	private Class<T> classe;
	public GenericDao() {	
		//java reflection
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void salvar(T entidade) {
		Session sessao = HibernateUtil.getSession().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
		}catch(Throwable e) {
			if(transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}finally {
			sessao.close();
		}
	}
	
	public void excluir(T entidade) {
		Session sessao = HibernateUtil.getSession().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(entidade);
			transacao.commit();
		}catch(Throwable e) {
			if(transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}finally {
			sessao.close();
		}
	}
	
	public void atualizar(T entidade) {
		Session sessao = HibernateUtil.getSession().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.update(entidade);
			transacao.commit();
		}catch(Throwable e) {
			if(transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List <T> listar(){
		Session sessao = HibernateUtil.getSession().openSession();
		try {
			Criteria consulta= sessao.createCriteria(classe);
			List<T> resultado = consulta.list();
			return resultado;
		}
		catch(Throwable e){
			throw e;
		}finally {
			sessao.close();
		}		
	}
	
	public T buscar(Long id) {
		Session sessao = HibernateUtil.getSession().openSession();
		try {
			Criteria consulta= sessao.createCriteria(classe);
			consulta.add(Restrictions.idEq(id));
			T resultado =  (T) consulta.uniqueResult();
			return resultado;
		}
		catch(Throwable e){
			throw e;
		}finally {
			sessao.close();
		}

	}
	
	public void merge(T entidade) {
		Session sessao = HibernateUtil.getSession().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.merge(entidade);
			transacao.commit();
		}catch(Throwable e) {
			if(transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}finally {
			sessao.close();
		}
	}
}
