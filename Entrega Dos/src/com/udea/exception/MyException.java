package com.udea.exception;
/**<h1> MyException</h1>
establece y maneja las posibles excepcion dentro del programa
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class MyException extends Exception {

	/**
	 * Constructor de la clase
	 */
	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constuctor de la clase
	 * @param arg0 
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */

	public MyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase
	 * @param arg0
	 * @param arg1
	 */

	public MyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
/**
 * Constructor de la clase
 * @param arg0
 */
	public MyException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
/**
 * Constructor de la clase
 * @param arg0
 */
	public MyException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
