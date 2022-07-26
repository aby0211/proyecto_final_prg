package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class EditarPerfilEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtContrasena;
	private JTextField txtCategoriaLab;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarPerfilEmpresa frame = new EditarPerfilEmpresa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditarPerfilEmpresa() {
		setTitle("Editar perfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 296, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 58, 273, 25);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(10, 140, 273, 25);
		panel.add(txtContrasena);
		
		txtCategoriaLab = new JTextField();
		txtCategoriaLab.setColumns(10);
		txtCategoriaLab.setBounds(10, 222, 273, 25);
		panel.add(txtCategoriaLab);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(10, 386, 273, 25);
		panel.add(txtTelefono);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 33, 54, 14);
		panel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContrasea.setBounds(10, 115, 80, 14);
		panel.add(lblContrasea);
		
		JLabel lblCategoriaLaboral = new JLabel("Categoria laboral");
		lblCategoriaLaboral.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCategoriaLaboral.setBounds(10, 197, 111, 14);
		panel.add(lblCategoriaLaboral);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProvincia.setBounds(10, 279, 54, 14);
		panel.add(lblProvincia);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(10, 363, 54, 14);
		panel.add(lblTelefono);
		
		JComboBox cmbxProvincia = new JComboBox();
		cmbxProvincia.setEditable(true);
		cmbxProvincia.setBounds(10, 304, 273, 25);
		panel.add(cmbxProvincia);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(150, 435, 133, 27);
		panel.add(btnConfirmar);
	}
}
