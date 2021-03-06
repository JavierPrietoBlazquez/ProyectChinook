package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @version
 * @author Javi
 *
 */
public class Conexion {
	
	
    static final String CONTRASEŅA = "";
    static final String URL_MYSQL = "jdbc:mysql://localhost/";
    static final String NOMBRE_BBDD = "chinook";
	static final String USUARIO = "root";
	
	private static Connection Conexion;
	
	/**
	 * Constructor de la clase conexion
	 * @param nombreBBDD
	 * @param usuario
	 * @param contraseņa
	 */
	public  Conexion(String nombreBBDD, String usuario, String contraseņa){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Conexion =  DriverManager.getConnection(URL_MYSQL+nombreBBDD,usuario,contraseņa);
			System.out.println("contectado");
		} catch (ClassNotFoundException e) {
			System.err.println("Error no encuentra el driver");
		} catch (SQLException e) {
			System.err.println("Error al conectar a la base de datos");
		}
	}
	
	public  Conexion(){
		this(NOMBRE_BBDD,USUARIO,CONTRASEŅA);
	}
	
	
	
	public static Connection getConexion() {
		return Conexion;
	}

	public static void setConexion(Connection newConexion) {
		Conexion = newConexion;
	}

	public static void diconnect() throws SQLException{
		Conexion.close();
	}	
}


