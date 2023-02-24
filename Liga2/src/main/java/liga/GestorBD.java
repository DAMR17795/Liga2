package liga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GestorBD {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String CONECTOR = "jdbc:mysql://localhost/Liga";
	
	public Connection getConnection() {
		Connection conexion = null;
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(CONECTOR, "usuario", "usuario");
		} catch (ClassNotFoundException cnfE) {
			cnfE.printStackTrace();
		} catch (SQLException sqlE) {
			System.err.println("\nHubo problemas con la base de datos:");
			System.err.println("Mensaje:\t"+sqlE.getMessage());
			System.err.println("Estado SQL:\t"+sqlE.getSQLState());
			System.err.println("Codigo Error:\t"+sqlE.getErrorCode());
		}
		return conexion;
	}
	
	public ArrayList<Equipos> listaEquipos() {
		ArrayList<Equipos> listaEquipos = new ArrayList<Equipos>();
		try {
			Connection conexion = getConnection();
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM Equipos";
			ResultSet respuesta = sentencia.executeQuery(sql);
	   		while(respuesta.next()) {
	   			String codigo = respuesta.getString("Codigo");
	   			String nombre = respuesta.getString("Nombre");
	   			String estadio = respuesta.getString("Estadio");
	   			String fundacion = respuesta.getString("Fundacion");
	   			String ciudad = respuesta.getString("Ciudad");
	   			String presidente = respuesta.getString("Presidente");
	   			int aforo = respuesta.getInt("Aforo");
				Equipos presi=new Equipos (codigo, nombre, estadio, aforo, fundacion, ciudad, presidente);			
				listaEquipos.add(presi);	
			}	
			conexion.close();
		} catch (SQLException sqlE) {
			System.err.println("\nHubo problemas con la base de datos:");
			System.err.println("Mensaje:\t"+sqlE.getMessage());
			System.err.println("Estado SQL:\t"+sqlE.getSQLState());
			System.err.println("Codigo Error:\t"+sqlE.getErrorCode());
		}
		return (listaEquipos);
	}
}
