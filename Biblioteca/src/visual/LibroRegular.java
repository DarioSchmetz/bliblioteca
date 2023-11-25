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

public class LibroRegular extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtAutor;
	private JTextField txtEditorial;
	private JTextField txtCodigo;
	private JTextField txtAnioPublicacion;
	private JTextField txtCantEjemplares;
	private JTextField txtCosto;

	public LibroRegular() {
		setTitle("Libro regular");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(27, 31, 58, 14);
		contentPane.add(lblNombre);
		
		JLabel lblautor = new JLabel("Autor:");
		lblautor.setBounds(27, 56, 58, 14);
		contentPane.add(lblautor);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setBounds(27, 81, 58, 14);
		contentPane.add(lblEditorial);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(27, 106, 58, 14);
		contentPane.add(lblCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(140, 26, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(140, 53, 86, 20);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtEditorial = new JTextField();
		txtEditorial.setBounds(140, 78, 86, 20);
		contentPane.add(txtEditorial);
		txtEditorial.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(140, 103, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreLibro = txtNombre.getText();
				String autor = txtAutor.getText();
			    String editorial = txtEditorial.getText(); 
			    int anioPublicacion = Integer.valueOf(txtAnioPublicacion.getText());
			    int cantEjemplares = Integer.valueOf(txtCantEjemplares.getText());
			    int costo = Integer.valueOf(txtCosto.getText());
				
				try {
					
					boolean devolucion = Controller.biblioteca.crearLibroRegular(nombreLibro, autor,
							editorial, anioPublicacion, cantEjemplares, costo);
					
					if (devolucion) {
						JOptionPane.showMessageDialog(null, "Libro regular guardado correctamente!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Error");
						}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnRegistrar.setBounds(176, 227, 89, 23);
		contentPane.add(btnRegistrar);
		
		JLabel lblAosPublicacion = new JLabel("Anio publicacion:");
		lblAosPublicacion.setBounds(27, 131, 103, 14);
		contentPane.add(lblAosPublicacion);
		
		txtAnioPublicacion = new JTextField();
		txtAnioPublicacion.setBounds(140, 128, 86, 20);
		contentPane.add(txtAnioPublicacion);
		txtAnioPublicacion.setColumns(10);
		
		JLabel lblCantEjemplares = new JLabel("<html>Cantidad de ejemplares:</html>");
		lblCantEjemplares.setBounds(27, 156, 103, 23);
		contentPane.add(lblCantEjemplares);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setBounds(27, 190, 65, 14);
		contentPane.add(lblCosto);
		
		txtCantEjemplares = new JTextField();
		txtCantEjemplares.setBounds(140, 159, 86, 20);
		contentPane.add(txtCantEjemplares);
		txtCantEjemplares.setColumns(10);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(140, 187, 86, 20);
		contentPane.add(txtCosto);
		txtCosto.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true);
				dispose();
				}
		});
		btnVolver.setBounds(278, 227, 89, 23);
		contentPane.add(btnVolver);
	}
}