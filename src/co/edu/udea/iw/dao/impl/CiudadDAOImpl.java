package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.CiudadDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

public class CiudadDAOImpl implements CiudadDAO{

	@Override
	public void insertar(Ciudad ciudad) throws ExceptionAplication {
		// TODO Auto-generated method stub
		
	}

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

	@Override
	public void modificar(Ciudad ciudad) throws ExceptionAplication {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Ciudad ciudad) throws ExceptionAplication {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ciudad obtener(Long codigo) throws ExceptionAplication {
		// TODO Auto-generated method stub
		return null;
	}

}
