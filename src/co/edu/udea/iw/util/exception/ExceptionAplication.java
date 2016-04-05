package co.edu.udea.iw.util.exception;


/**
 * ExceptioAplication
 * Permite capturar los errores que se
 * generan en tiempo de ejecucion de la aplicacion
 * @author Yoiner Gomez yoiner.gomez22@gmail.com
 * @version 1
 * @category Exception
 */
public class ExceptionAplication extends Exception{

	/*
	 * Para generar los siguientes metodos de esta clase
	 * Generate Constructors from superClass
	 */
	
	public ExceptionAplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionAplication(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ExceptionAplication(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExceptionAplication(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExceptionAplication(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
