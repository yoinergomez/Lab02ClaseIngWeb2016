package co.edu.udea.iw.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import co.edu.udea.iw.util.exception.ExceptionAplication;

/*
 * Clase DataSource que obtiene la conexion con la BD
 */
public class HibernateSessionFactory {

	private static SessionFactory sessionFactory;
	private Configuration configuration;
	private static HibernateSessionFactory instance = null;
	
	/**
	 * Constructor de la clase 
	 */
	protected HibernateSessionFactory(){
		sessionFactory = null;
		configuration = new Configuration();
	}
	
	/**
	 * Obtener instancia unica
	 * @return
	 */
	public static HibernateSessionFactory getInstance() {
	      if(instance == null) {
	         instance = new HibernateSessionFactory();
	      }
	      return instance;
	}
	
	
	/**
	 * Obtener sesion activa
	 * @return
	 * @throws ExceptionAplication
	 */
	public Session getSession() throws ExceptionAplication{
		try{
			if(sessionFactory==null){
				configuration.configure("co/edu/udea/iw/dto/cfg/hibernate.cfg.xml");
				sessionFactory = configuration.buildSessionFactory();
			}
			return sessionFactory.openSession();
		} catch(HibernateException e){
			throw new ExceptionAplication(e);
		}
	}
	
	/**
	 * Evitar la clonacion del objeto singleton
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException(); 
	}
}
