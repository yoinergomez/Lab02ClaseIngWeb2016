package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.CiudadDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

/**
 * Implementa los metodos CRUD para operar en la entidad Ciudad
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class CiudadDAOImpl implements CiudadDAO{
	
	/**
	 * Inserta una ciudad en la base de datos
	 * de acuerdo con el objeto Ciudad enviado como parametro
	 */
	@Override
	public void insertar(Ciudad ciudad) throws ExceptionAplication {
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			
			Transaction tx = session.beginTransaction();
			session.save(ciudad);
			tx.commit();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		
	}
	
	/**
	 * Obtiene todas las ciudades de la base de datos
	 * y la retorna en una lista que contiene objetos de tipo Ciudad
	 */
	@Override
	public List<Ciudad> obtenerTodas() throws ExceptionAplication {
		Session session = null;
		List<Ciudad> ciudades = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			Criteria criteria = session.createCriteria(Ciudad.class);
			
			ciudades = criteria.list();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		return ciudades;
	}
	
	/**
	 * Modifica una ciudad de acuerdo a los datos
	 * del objeto de tipo Ciudad ingresado en el parametro
	 */
	@Override
	public void modificar(Ciudad ciudad) throws ExceptionAplication {
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			
			Transaction tx = session.beginTransaction();
			session.update(ciudad);
			tx.commit();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		
	}
	
	/**
	 * Elimina una ciudad de la base de datos según
	 * el objeto de tipo Ciudad ingresado en el parametro
	 */
	@Override
	public void eliminar(Ciudad ciudad) throws ExceptionAplication {
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			
			Transaction tx = session.beginTransaction();
			session.delete(ciudad);
			tx.commit();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		
	}
	
	/**
	 * Obtiene una ciudad de la base de datos de 
	 * acuerdo al codigo que identifica a dicho objeto
	 */
	@Override
	public Ciudad obtener(Long codigo) throws ExceptionAplication {
		Ciudad ciudad = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getInstance().getSession();
			//Desde aqui
			Criteria criteria = session.createCriteria(Ciudad.class);
			criteria.add(Restrictions.eq("codigo", codigo));
			
			//Obtener el unica tupla de la BD
			ciudad = (Ciudad) criteria.uniqueResult();
			//Hasta aqui
			
			/*
			//Se puede reemplazar por
			ciudad = (Ciudad) session.get(Ciudad.class, codigo);
			*/
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		return ciudad;
	}

}
