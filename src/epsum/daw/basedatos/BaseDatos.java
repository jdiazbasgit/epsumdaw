package epsum.daw.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {

	public static void main(String[] args) {
		 Connection conexion1=null;
		// try {
		try (Connection conexion = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.71:3306/empresas?useSSL=false&serverTimezone=UTC", "curso", "Cursocurso1;");) {
			conexion1=conexion;
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.71:3306/empresas?useSSL=false&serverTimezone=UTC",
			// "curso", "Cursocurso1;");
			Statement statement = conexion1.createStatement();
			int resultado = statement.executeUpdate("insert into cargos (descripcion) values ('Directora1')");
			System.out.println(resultado);
			System.out.println("conexion creada correctamente");

			PreparedStatement preparedStatement = conexion1
					.prepareStatement("insert into cargos (descripcion) values(?)");
			String[] cargos = { "programador111", "limpiador111", "conductor111", "jefe de proyecto111" };
			for (int i = 0; i < cargos.length; i++) {
				preparedStatement.setString(1, cargos[i]);
				preparedStatement.execute();

			}

			ResultSet resultSet = statement.executeQuery("select id,descripcion from cargos");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
			}

		} catch (

		SQLException e) {
			e.printStackTrace();
			System.out.println("conexion no creada");
		}
		
		try {
			System.out.println(conexion1.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * finally {
	 * 
	 * try { conexion.close(); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * }*/
	 
	 

}
