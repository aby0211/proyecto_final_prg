package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

import logico.BolsaDeTrabajo;

import java.awt.Color;

public class Reporte2 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reporte1 dialog = new Reporte1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reporte2() {
		setTitle("Reporte 2");
		setBounds(100, 100, 450, 239);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad de personas empleadas por g\u00E9nero:");
		lblNewLabel.setBounds(10, 11, 315, 14);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 36, 404, 139);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOtrosEmpleados = new JLabel("Otros empleados:");
		lblOtrosEmpleados.setBounds(10, 115, 248, 14);
		panel_1.add(lblOtrosEmpleados);
		
		JLabel lblMujeresEmpleadas = new JLabel("Mujeres empleadas:");
		lblMujeresEmpleadas.setBounds(10, 63, 171, 14);
		panel_1.add(lblMujeresEmpleadas);
		
		JLabel lblHombresEmpleados = new JLabel("Hombres empleados:");
		lblHombresEmpleados.setBounds(10, 11, 275, 14);
		panel_1.add(lblHombresEmpleados);
		
		JLabel lblUni = new JLabel("\"\"");
		lblUni.setBounds(295, 11, 191, 14);
		panel_1.add(lblUni);
		
		JLabel lblTecnico = new JLabel("\"\"");
		lblTecnico.setBounds(295, 63, 171, 14);
		panel_1.add(lblTecnico);
		
		JLabel lblObrero = new JLabel("\"\"");
		lblObrero.setBounds(295, 115, 171, 14);
		panel_1.add(lblObrero);
		lblUni.setText(String.valueOf(BolsaDeTrabajo.getInstance().getHombresE()));
		lblTecnico.setText(String.valueOf(BolsaDeTrabajo.getInstance().getMujeresE()));
		lblObrero.setText(String.valueOf(BolsaDeTrabajo.getInstance().getOtrosE()));
	}
}
