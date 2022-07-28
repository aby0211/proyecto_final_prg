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
	private JTextField txtEmail;
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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("Ingresar correo electronico:");
				label.setFont(new Font("Tahoma", Font.PLAIN, 14));
				label.setBounds(123, 11, 177, 14);
				panel.add(label);
			}
			{
				txtEmail = new JTextField();
				txtEmail.setColumns(10);
				txtEmail.setBounds(78, 36, 268, 25);
				panel.add(txtEmail);
			}
			{
				txtPassword = new JTextField();
				txtPassword.setColumns(10);
				txtPassword.setBounds(78, 108, 268, 25);
				panel.add(txtPassword);
			}
			{
				JLabel label = new JLabel("Ingresar contrase\u00F1a:");
				label.setFont(new Font("Tahoma", Font.PLAIN, 14));
				label.setBounds(144, 83, 135, 14);
				panel.add(label);
			}
			JLabel lblIncorrecto = new JLabel("Correo o contrase\u00F1a incorrectos");
			{
				lblIncorrecto.setVisible(false);
				lblIncorrecto.setForeground(Color.RED);
				lblIncorrecto.setBounds(115, 144, 194, 14);
				panel.add(lblIncorrecto);
			}
			{
				JButton button = new JButton("Iniciar sesi\u00F3n");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(BolsaDeTrabajo.getInstance().verificarLogin(txtEmail.getText(), txtPassword.getText())) {
							dispose();
							InicioEmpresa list = new InicioEmpresa(BolsaDeTrabajo.getInstance().buscarEmpresaByEmail(txtEmail.getText()));
							list.setVisible(true);
						}else {
							lblIncorrecto.setVisible(true);
						}
					}
				});
				button.setFont(new Font("Tahoma", Font.PLAIN, 14));
				button.setBounds(142, 169, 139, 31);
				panel.add(button);
			}
			{
				JButton button = new JButton("REGISTRARME");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						Registrar list = new Registrar();
						list.setVisible(true);
						
					}
				});
				button.setFont(new Font("Tahoma", Font.PLAIN, 14));
				button.setBounds(140, 211, 143, 31);
				panel.add(button);
			}
		}
	}

}
