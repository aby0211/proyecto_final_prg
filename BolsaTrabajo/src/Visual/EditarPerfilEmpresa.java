package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaDeTrabajo;
import logico.CentroEmpleador;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarPerfilEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtEmail;
	private JTextField txtContrasena;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public EditarPerfilEmpresa(CentroEmpleador centro) {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 323, 501);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(12, 36, 273, 25);
			panel.add(txtEmail);
			
			txtContrasena = new JTextField();
			txtContrasena.setColumns(10);
			txtContrasena.setBounds(12, 118, 273, 25);
			panel.add(txtContrasena);
			
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(12, 364, 273, 25);
			panel.add(txtTelefono);
			
			JLabel label = new JLabel("Email");
			label.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label.setBounds(12, 11, 54, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Contrase\u00F1a");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_1.setBounds(12, 93, 80, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("Categoria laboral");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_2.setBounds(12, 175, 111, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("Provincia");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_3.setBounds(12, 257, 54, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("Telefono");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_4.setBounds(12, 341, 54, 14);
			panel.add(label_4);
			
			JComboBox cbxProvincia = new JComboBox();
			cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
			cbxProvincia.setEditable(true);
			cbxProvincia.setBounds(12, 282, 273, 25);
			panel.add(cbxProvincia);
			JComboBox cbxCategoria = new JComboBox();
			
			JButton button = new JButton("Confirmar");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BolsaDeTrabajo.getInstance().buscarEmpresaByEmail(centro.getEmail()).setEmail(txtEmail.getText());
					BolsaDeTrabajo.getInstance().buscarEmpresaByEmail(centro.getEmail()).setCategoriaLaboral(cbxCategoria.getSelectedItem().toString());
					BolsaDeTrabajo.getInstance().buscarEmpresaByEmail(centro.getEmail()).setProvincia(cbxProvincia.getSelectedItem().toString());
					BolsaDeTrabajo.getInstance().buscarEmpresaByEmail(centro.getEmail()).setTelefono(txtTelefono.getText());
					dispose();
					JOptionPane.showMessageDialog(null, "Los cambios se han realizado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			button.setBounds(152, 414, 133, 27);
			panel.add(button);
			
			
			cbxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
			cbxCategoria.setEditable(true);
			cbxCategoria.setBounds(12, 200, 273, 25);
			panel.add(cbxCategoria);
			
			txtEmail.setText(centro.getEmail());
			txtTelefono.setText(centro.getTelefono());
			cbxCategoria.setSelectedItem(centro.getCategoriaLaboral());
			cbxProvincia.setSelectedItem(centro.getProvincia());
			
		}
	}
}
