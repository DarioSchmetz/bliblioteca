package accesoDatos;

public class Controller {
	
	public static final BibliotecaController biblioteca =
    		new BibliotecaController(new MySqlTransaccionBiblioteca());
}