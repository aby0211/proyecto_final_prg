package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaDeTrabajo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setTitle("Bolsa de trabajo");
		setBounds(100, 100, 816, 467);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel txtUsername = new JLabel("Usuario");
				txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 26));
				txtUsername.setBounds(42, 112, 219, 31);
				panel.add(txtUsername);
			}
			{
				txtUsername = new JTextField();
				txtUsername.setColumns(10);
				txtUsername.setBounds(42, 154, 219, 25);
				panel.add(txtUsername);
			}
			{
				txtPassword = new JTextField();
				txtPassword.setColumns(10);
				txtPassword.setBounds(42, 254, 219, 25);
				panel.add(txtPassword);
			}
			{
				JLabel lblContrasea = new JLabel("Contrase\u00F1a");
				lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 26));
				lblContrasea.setBounds(42, 212, 219, 31);
				panel.add(lblContrasea);
			}
			JLabel lblIncorrecto = new JLabel("Usuario o contrase\u00F1a incorrectos");
			lblIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 14));
			{
				lblIncorrecto.setVisible(false);
				lblIncorrecto.setForeground(Color.RED);
				lblIncorrecto.setBounds(52, 347, 271, 14);
				panel.add(lblIncorrecto);
			}
			{
				JButton button = new JButton("Iniciar sesi\u00F3n");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(BolsaDeTrabajo.getInstance().verificarLogin(txtUsername.getText(), txtPassword.getText())) {
							dispose();
							Principal list = new Principal(BolsaDeTrabajo.getInstance().buscarUsuarioByUser(txtUsername.getText()));
							list.setVisible(true);
						}else {
							lblIncorrecto.setVisible(true);
							JOptionPane.showMessageDialog(null, "Su nombre de usuario o contraseña son incorrectos.", "Información", JOptionPane.INFORMATION_MESSAGE);

						}
					}
				});
				button.setFont(new Font("Tahoma", Font.PLAIN, 14));
				button.setBounds(81, 305, 139, 31);
				panel.add(button);
			}
			
			JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
			lblIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblIniciarSesin.setBounds(10, 30, 219, 31);
			panel.add(lblIniciarSesin);
			
			JLabel imageLogin = new JLabel("");
			imageLogin.setBounds(333, 11, 442, 396);
			panel.add(imageLogin);
			Image img = new ImageIcon(this.getClass().getResource("/Untitled-1.png")).getImage();
			imageLogin.setIcon(new ImageIcon(img));
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 72, 313, 335);
			panel.add(separator);
			BolsaDeTrabajo.getInstance().cargarBolsa();
		}
	}
}
