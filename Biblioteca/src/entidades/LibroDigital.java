package entidades;

public class LibroDigital extends LibroRegular {
	
	private int codigo;
	private String nomArchivoDigitalizado;
	
	public LibroDigital() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomArchivoDigitalizado() {
		return nomArchivoDigitalizado;
	}

	public void setNomArchivoDigitalizado(String nomArchivoDigitalizado) {
		this.nomArchivoDigitalizado = nomArchivoDigitalizado;
	}
	
	
}