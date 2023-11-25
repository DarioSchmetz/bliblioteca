package accesoDatos;

import entidades.LibroDigital;
import entidades.LibroRegular;

public interface TransaccionGenericaBiblioteca {

	
	public boolean guardarLibroDigital(LibroDigital libroDigital) throws Exception;


	public boolean guardarLibroRegular(LibroRegular libroRegular) throws Exception;
}