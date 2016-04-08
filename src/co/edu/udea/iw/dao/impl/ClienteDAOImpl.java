package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.ClienteDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

public class ClienteDAOImpl implements ClienteDAO{

	@Override
	public void insertar(Cliente cliente) throws ExceptionAplication {
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			
			Transaction tx = session.beginTransaction();
			session.save(cliente);
			tx.commit();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		
	}

	@Override
	public List<Cliente> obtenerTodos() throws ExceptionAplication {
		Session session = null;
		List<Cliente> clientes = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			Criteria criteria = session.createCriteria(Cliente.class);
			
			clientes = criteria.list();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		return clientes;
	}

	@Override
	public void modificar(Cliente cliente) throws ExceptionAplication {
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			
			Transaction tx = session.beginTransaction();
			session.update(cliente);
			tx.commit();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}		
	}

	@Override
	public void eliminar(Cliente cliente) throws ExceptionAplication {
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			
			Transaction tx = session.beginTransaction();
			session.delete(cliente);
			tx.commit();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}		
	}

	@Override
	public Cliente obtener(String cedula) throws ExceptionAplication {
		Cliente cliente = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();

			Criteria criteria = session.createCriteria(Cliente.class);
			criteria.add(Restrictions.eq("cedula", cedula));

			cliente = (Cliente) criteria.uniqueResult();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		return cliente;
	}



}
