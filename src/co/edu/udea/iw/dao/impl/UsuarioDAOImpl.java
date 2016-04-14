/**
 * 
 */
package co.edu.udea.iw.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.dto.UsuarioDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

/**
 * Implementa los metodos CRUD para operar en la entidad Usuario
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class UsuarioDAOImpl implements UsuarioDAO{
	
	/**
	 * Obtener usuario através del parametro login
	 */
	@Override
	public Usuario obtener(String login) throws ExceptionAplication {
		Usuario usuario = null;
		Session session = null;
		try{
			//Obtener sesion
			session = HibernateSessionFactory.getInstance().getSession();
			
			//Realizar búsqueda
			Criteria criteria = session.createCriteria(Usuario.class);
			criteria.add(Restrictions.eq("login", login));
			
			//Retornar resultado de la búsqueda
			usuario = (Usuario) criteria.uniqueResult();
			
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		} finally{
			if (session != null){
				session.close();
			}
		}
		return usuario;
	}

}
