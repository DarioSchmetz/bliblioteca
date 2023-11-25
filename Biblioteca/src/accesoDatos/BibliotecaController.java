package accesoDatos;

import entidades.LibroDigital;
import entidades.LibroRegular;

public class BibliotecaController {
	
	private TransaccionGenericaBiblioteca transaccionGenericaBiblioteca;
	
	
	public BibliotecaController(TransaccionGenericaBiblioteca transaccionador) {
		this.transaccionGenericaBiblioteca = transaccionador;
	}
	
	public boolean crearLibroDigital(String nombreLibro, String nomArchivoDigitalizado,
			String autor, String editorial, int codigo) throws Exception {
		
		LibroDigital libroDigital = new LibroDigital();
		
		libroDigital.setNombreLibro(nombreLibro);
		libroDigital.setNomArchivoDigitalizado(nomArchivoDigitalizado);
		libroDigital.setAutor(autor);
		libroDigital.setEditorial(editorial);
		libroDigital.setCodigo(codigo);
		
		return this.agregarLibroDigital(libroDigital);
	}
	
	public boolean crearLibroRegular(String nombreLibro, String autor,
			String editorial, int anioPublicacion, int cantEjemplares, double costo) throws Exception {
		
		LibroRegular libroRegular = new LibroRegular();
		
		libroRegular.setNombreLibro(nombreLibro);
		libroRegular.setAutor(autor);
		libroRegular.setEditorial(editorial);
		libroRegular.setAnioPublicacion(anioPublicacion);
		libroRegular.setCantidadEjemplares(cantEjemplares);
		libroRegular.setCosto(costo);
		
		return this.agregarLibroRegular(libroRegular);
	}
	
	public boolean agregarLibroDigital(LibroDigital libroDigital) throws Exception {
		return transaccionGenericaBiblioteca.guardarLibroDigital(libroDigital);	
	}
	
	public boolean agregarLibroRegular(LibroRegular libroRegular) throws Exception {
		return transaccionGenericaBiblioteca.guardarLibroRegular(libroRegular);	
	}
	
}