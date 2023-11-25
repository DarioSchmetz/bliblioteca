package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import accesoDatos.Controller;

public class LibroDigital extends JFrame {

	private JPanel contentPane;
	private JTextField textnombrelibro;
	private JTextField textNombreArchivoDigitilizado;
	private JTextField textFieldAutor;
	private JTextField textEditorial;
	private JTextField textFCodigo;

	public LibroDigital() {
		setTitle("Libro digital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 23, 110, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNombreArchivo = new JLabel("Nombre archivodigital:");
		lblNombreArchivo.setBounds(0, 48, 130, 14);
		contentPane.add(lblNombreArchivo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 73, 46, 14);
		contentPane.add(lblAutor);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setBounds(10, 98, 86, 14);
		contentPane.add(lblEditorial);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 123, 46, 14);
		contentPane.add(lblCodigo);
		
		textnombrelibro = new JTextField();
		textnombrelibro.setBounds(130, 20, 86, 20);
		contentPane.add(textnombrelibro);
		textnombrelibro.setColumns(10);
		
		textNombreArchivoDigitilizado = new JTextField();
		textNombreArchivoDigitilizado.setBounds(130, 45, 86, 20);
		contentPane.add(textNombreArchivoDigitilizado);
		textNombreArchivoDigitilizado.setColumns(10);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(130, 70, 86, 20);
		contentPane.add(textFieldAutor);
		textFieldAutor.setColumns(10);
		
		textEditorial = new JTextField();
		textEditorial.setBounds(130, 95, 86, 20);
		contentPane.add(textEditorial);
		textEditorial.setColumns(10);
		
		textFCodigo = new JTextField();
		textFCodigo.setBounds(130, 120, 86, 20);
		contentPane.add(textFCodigo);
		textFCodigo.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String nombreLibro = textnombrelibro.getText();
			String nomArchivoDigitalizado = textNombreArchivoDigitilizado.getText();
			String autor = textFieldAutor.getText();
			String editorial = textEditorial.getText();
			int codigo = Integer.valueOf(textFCodigo.getText());
			
			try {
				
				boolean devolucion = Controller.biblioteca.crearLibroDigital(nombreLibro,
						nomArchivoDigitalizado, autor, editorial, codigo);
				
				if (devolucion) {
					JOptionPane.showMessageDialog(null, "Libro digital guardado correctamente!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Error");
					}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		});
		btnRegistrar.setBounds(174, 167, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true);
				dispose();
			}
		});
		
		btnVolver.setBounds(273, 167, 89, 23);
		contentPane.add(btnVolver);
	}

}