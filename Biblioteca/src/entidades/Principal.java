package entidades;

import accesoDatos.Controller;

public class Principal {
	
	public static void main(String[] args) throws Exception {

		
		/* COMENTAR LO QUE "NO" SE QUIERA EJECUTAR,
		 * Y DESCOMENTAR LO QUE "SI" SE QUIERA EJECUTAR.
		 * 
		 * GUARDAR CAMBIOS PARA QUE SE ACTUALICEN. */
		
		
		// Imprimir por consola:
//		impresionPorConsola();
		
		// Guardar en base de datos un libroRegular:
//		guardarEnBaseDeDatosUnLibroRegular();
		
		// Guardar en base de datos un libroDigital:
//		guardarEnBaseDeDatosUnLibroDigital();
		
		// Devolver un libroRegular desde la base de datos:
//		Conexion.devolverTodosLosLibrosRegularesDeLaBaseDeDatos();
		
		// Devolver un libroDigital desde la base de datos:
//		Conexion.devolverTodosLosLibrosDigitalesDeLaBaseDeDatos();
		
		/* Eliminar un libroRegular de la base de datos (por id):
		 * Entre parentesis colocar el numero identificatorio que esta en la columna de id. */
//		Conexion.eliminarUnLibroRegularDeLaBaseDeDatosPorId(1);
		
		
		/* Eliminar un libroDigital de la base de datos (por id):
		 * Entre parentesis colocar el numero identificatorio que esta en la columna de id. */
//		Conexion.eliminarUnLibroDigitalDeLaBaseDeDatosPorId(3);

	}
	
	// GUARDAR EN BASE DE DATOS UN libroRegular.
	private static void guardarEnBaseDeDatosUnLibroRegular() throws Exception {
		
			LibroRegular libroRegular = new LibroRegular();
			
			String nombreLibroRegular = "El nombre del viento";
			String autorLibroRegular = "Patrick Rotfhus";
			String editorialLibroRegular = "Santillan";
			int anioPublicacion = 2014;
			int cantidadEjemplares = 300;
			double costo = 500;
			
			
			libroRegular.setNombreLibro(nombreLibroRegular);
			libroRegular.setAutor(autorLibroRegular);
			libroRegular.setEditorial(editorialLibroRegular);
			libroRegular.setAnioPublicacion(anioPublicacion);
			libroRegular.setCantidadEjemplares(cantidadEjemplares);
			libroRegular.setCosto(costo);
			
			// Almacena un libro regular en la BD.
//			boolean devolucionLibroRegular  = Controller.crearLibroRegular(libroRegular);
			
			// Si se almaceno correctamente o no, arroja un mensaje.
//			if (devolucionLibroRegular) {
//				System.out.println("Se ha cargado correctamente un libro regular.");
//			}
//			else {
//				System.out.println("Error. No se ha podido cargar el libro regular.");
//			}
	}
	
	// GUARDAR EN BASE DE DATOS UN libroDigital.
	private static void guardarEnBaseDeDatosUnLibroDigital() throws Exception {
		
		LibroDigital libroDigital= new LibroDigital();

//		String nombreLibroDigital = "CORE JAVA 2 FUNDAMENTOS";
//		String nomArchivoDigitalizado = "java2_fund.pdf";
//		String autorLibroDigital = "Cay String. Horstmann";
//		String editorialLibroDigital = "Prentice Hall";
//		int codigo = 101;
		
		
		String nombreLibroDigital = "El Señor de Los Anillos";
		String nomArchivoDigitalizado = "EsDlA";
		String autorLibroDigital = "Tolkian";
		String editorialLibroDigital = "Alguna Editorial";
		int codigo = 56;
		
		
		libroDigital.setNombreLibro(nombreLibroDigital);
		libroDigital.setNomArchivoDigitalizado(nomArchivoDigitalizado);
		libroDigital.setAutor(autorLibroDigital);
		libroDigital.setEditorial(editorialLibroDigital);
		libroDigital.setCodigo(codigo);
		
		// Almacena un libro digital en la BD.
//		boolean devolucionLibroDigital = Controller.crearLibroDigital(libroDigital);
				
		// Si se almaceno correctamente o no, arroja un mensaje.
//		if (devolucionLibroDigital) {
//			
//			System.out.println("Se ha cargado correctamente un libro digital.");
//			}
//			else {
//				System.out.println("Error. No se ha podido cargar el libro digital.");
//			}
	}
	
	
	
	
	
	
	
	
	
	
	// IMPRIMIR POR CONSOLA:
	private static void impresionPorConsola() {
		
				// Crear libro 1:
				
				LibroRegular libroUno = new LibroRegular();
				
				String nombreLibroUno = "El principito";
				String autorLibroUno = "Antoine de Saint-Exupéry";
				String editorialLibroUno = "Reynal & Hitchcock";
				int anioPublicacionLibroUno = 2000;
				int cantidadEjemplaresLibroUno = 6000000;
				double costoLibroUno = 10000;
				
				libroUno.setNombreLibro(nombreLibroUno);
				libroUno.setAutor(autorLibroUno);
				libroUno.setEditorial(editorialLibroUno);
				libroUno.setAnioPublicacion(anioPublicacionLibroUno);
				libroUno.setCantidadEjemplares(cantidadEjemplaresLibroUno);
				libroUno.setCosto(costoLibroUno);
				
				// Crear libro 2:
				
				LibroRegular libroDos = new LibroRegular();
				
				String nombreLibroDos = "El nombre del viento";
				String autorLibroDos = "Patrick Rotfhus";
				String editorialLibroDos = "Santillan";
				int anioPublicacionLibroDos = 2014;
				int cantidadEjemplaresLibroDos = 300;
				double costoLibroDos = 500;
				
				libroDos.setNombreLibro(nombreLibroDos);
				libroDos.setAutor(autorLibroDos);
				libroDos.setEditorial(editorialLibroDos);
				libroDos.setAnioPublicacion(anioPublicacionLibroDos);
				libroDos.setCantidadEjemplares(cantidadEjemplaresLibroDos);
				libroDos.setCosto(costoLibroDos);
				
				
				
				// Crear libro digital:
				
				LibroDigital libroDigital = new LibroDigital();
				
				libroDigital.setNombreLibro("CORE JAVA 2 FUNDAMENTOS");
				libroDigital.setNomArchivoDigitalizado("java2_fund.pdf");
				libroDigital.setAutor("Cay String. Horstmann");
				libroDigital.setEditorial("Prentice Hall");
				
				
				
				
				// Muestro por consola la informacion de todos los libros:
						
						System.out.println("LIBRO 1:" + "\n"
								+ "Nombre libro: " + libroUno.getNombreLibro() + "\n"
								+ "Autor libro: " + libroUno.getAutor() + "\n"
								+ "Editorial libro: " + libroUno.getEditorial() + "\n"
								+ "Año de publicación libro: " + libroUno.getAnioPublicacion() + "\n"
								+ "Cantidad de ejemplares del libro: " + libroUno.getCantidadEjemplares() + "\n"
								+ "Costo del libro: " + libroUno.getCosto() + "\n");
						
						System.out.println("LIBRO 2:" + "\n"
								+ "Nombre libro: " + libroDos.getNombreLibro() + "\n"
								+ "Autor libro: " + libroDos.getAutor() + "\n"
								+ "Editorial libro: " + libroDos.getEditorial() + "\n"
								+ "Año de publicación libro: " + libroDos.getAnioPublicacion() + "\n"
								+ "Cantidad de ejemplares del libro: " + libroDos.getCantidadEjemplares() + "\n"
								+ "Costo del libro: " + libroDos.getCosto() + "\n");
						
						System.out.println("LIBRO DIGITAL:" + "\n"
								+ "Nombre libro: " + libroDigital.getNombreLibro() + "\n"
								+ "Nombre archivo del libro: " + libroDigital.getNomArchivoDigitalizado() + "\n"
								+ "Autor libro: " + libroDigital.getAutor() + "\n"
								+ "Editorial libro: " + libroDigital.getEditorial() + "\n");
						
	}
	
}