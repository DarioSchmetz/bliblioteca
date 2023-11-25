package accesoDatos;

import java.sql.PreparedStatement;

import entidades.LibroDigital;
import entidades.LibroRegular;

public class MySqlTransaccionBiblioteca implements TransaccionGenericaBiblioteca {

	@Override
	public boolean guardarLibroDigital(LibroDigital libroDigital) throws Exception {
		
		String query = "INSERT INTO libro_digital (nombreLibro, nomArchivoDigitalizado, autor,"
				+ "editorial, codigo) VALUES (?, ?, ?, ?, ?)";

		// create the mysql insert preparedstatement.
		PreparedStatement preparedStmt = AdministradorDeConexiones.getConnection().prepareStatement(query);
		
		preparedStmt.setString(1, libroDigital.getNombreLibro());
		preparedStmt.setString(2, libroDigital.getNomArchivoDigitalizado());
		preparedStmt.setString(3, libroDigital.getAutor());
		preparedStmt.setString(4, libroDigital.getEditorial());
		preparedStmt.setInt(5, libroDigital.getCodigo());

		// execute the preparedstatement.
		boolean devolucion = !preparedStmt.execute();

		// close the connection.
		AdministradorDeConexiones.getConnection().close();
		
		return devolucion;
	}

	@Override
	public boolean guardarLibroRegular(LibroRegular libroRegular) throws Exception {
		String query = "INSERT INTO libro_regular (nombreLibro, autor, editorial, anioPublicacion,"
				+ "cantidadEjemplares, costo) VALUES (?, ?, ?, ?, ?, ?)";

		// create the mysql insert preparedstatement.
		PreparedStatement preparedStmt = AdministradorDeConexiones.getConnection().prepareStatement(query);
		
		preparedStmt.setString(1, libroRegular.getNombreLibro());
		preparedStmt.setString(2, libroRegular.getAutor());
		preparedStmt.setString(3, libroRegular.getEditorial());
		preparedStmt.setInt(4, libroRegular.getAnioPublicacion());
		preparedStmt.setInt(5, libroRegular.getCantidadEjemplares());
		preparedStmt.setDouble(6, libroRegular.getCosto());
		
		// execute the preparedstatement.
		boolean devolucion = !preparedStmt.execute();

		// close the connection.
		AdministradorDeConexiones.getConnection().close();
		
		return devolucion;
	}
}