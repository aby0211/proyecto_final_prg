package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaDeTrabajo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 663, 613);
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
				txtPassword.setBounds(42, 280, 219, 25);
				panel.add(txtPassword);
			}
			{
				JLabel lblContrasea = new JLabel("Contrase\u00F1a");
				lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 26));
				lblContrasea.setBounds(42, 238, 219, 31);
				panel.add(lblContrasea);
			}
			JLabel lblIncorrecto = new JLabel("Usuario o contrase\u00F1a incorrectos");
			lblIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 14));
			{
				lblIncorrecto.setVisible(false);
				lblIncorrecto.setForeground(Color.RED);
				lblIncorrecto.setBounds(52, 382, 271, 14);
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
						}
					}
				});
				button.setFont(new Font("Tahoma", Font.PLAIN, 14));
				button.setBounds(81, 340, 139, 31);
				panel.add(button);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(304, 11, 323, 542);
			panel.add(panel_1);
			
			JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
			lblIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblIniciarSesin.setBounds(10, 30, 219, 31);
			panel.add(lblIniciarSesin);
		}
	}
}
