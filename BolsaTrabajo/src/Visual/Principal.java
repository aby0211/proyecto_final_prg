package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Administrador;
import logico.Candidato;
import logico.CentroEmpleador;
import logico.Usuario;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseMotionAdapter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Principal(Usuario user) {
		setTitle("Bolsa de trabajo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 600);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu btnEmpresa = new JMenu("Empresa");
		menuBar.add(btnEmpresa);
		
		JMenuItem btnMisOfertas = new JMenuItem("Lista de ofertas");
		btnMisOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MisOfertas list = new MisOfertas(((CentroEmpleador)user));
				list.setVisible(true);
			}
		});
		btnEmpresa.add(btnMisOfertas);
		
		JMenuItem btnCrearOferta = new JMenuItem("Crear oferta");
		btnCrearOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearOferta list = new CrearOferta(user);
				list.setVisible(true);
			}
		});
		btnEmpresa.add(btnCrearOferta);
		
		JMenu btnCandadito = new JMenu("Candidato");
		menuBar.add(btnCandadito);
		
		JMenuItem btnCrearPost = new JMenuItem("Crear postulacion");
		btnCrearPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPostulacion list=new CrearPostulacion(((Candidato)user));
				list.setVisible(true);
			}
		});
		btnCandadito.add(btnCrearPost);
		
		JMenuItem btnListaPost = new JMenuItem("Lista de Postulaciones");
		btnListaPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaPostulaciones list = new ListaPostulaciones((Candidato)user);
				list.setVisible(true);
			}
		});
		btnCandadito.add(btnListaPost);
		
		JMenu btnSolicitud = new JMenu("Solicitudes");
		menuBar.add(btnSolicitud);
		
		JMenuItem btnListaPostulaciones = new JMenuItem("Lista de solicitudes");
		btnListaPostulaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaSolicitudes list = new ListaSolicitudes();
				list.setVisible(true);
			}
		});
		btnSolicitud.add(btnListaPostulaciones);
		
		JMenu btnUsuario = new JMenu("Usuarios");
		menuBar.add(btnUsuario);
		
		JMenuItem btnAnnadirUsuario = new JMenuItem("A\u00F1adir usuario");
		btnAnnadirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrar list=new Registrar();
				list.setVisible(true);
			}
		});
		btnUsuario.add(btnAnnadirUsuario);
		
		JMenuItem btnListaUsuarios = new JMenuItem("Lista de Usuarios");
		btnListaUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaDeUsuarios list = new ListaDeUsuarios();
				list.setVisible(true);
			}
		});
		btnUsuario.add(btnListaUsuarios);
		
		JMenu btnReporte = new JMenu("Reportes");
		menuBar.add(btnReporte);
		
		JMenuItem btnReporte1 = new JMenuItem("Reporte 1");
		btnReporte.add(btnReporte1);
		
		JMenuItem btnReporte2 = new JMenuItem("Reporte 2");
		btnReporte.add(btnReporte2);
		
		JMenuItem btnReporte3 = new JMenuItem("Reporte 3");
		btnReporte.add(btnReporte3);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setForeground(Color.black);
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				Login list = new Login();
				list.setVisible(true);
			}
			
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_1.setBackground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				panel_1.setBackground(Color.white);
			}
		});

		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(751, 420, 96, 96);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(39, 41, 17, 14);
		panel_1.add(lblNewLabel);
		
		JLabel imageLogin = new JLabel("");
		imageLogin.setBounds(30, 36, 837, 359);
		panel.add(imageLogin);
		setLocationRelativeTo(null);
		if(user instanceof Administrador) {
			btnEmpresa.setEnabled(false);
			btnCandadito.setEnabled(false);
			
			
		}
		
		if(user instanceof CentroEmpleador) {
			btnEmpresa.setEnabled(true);
			btnCandadito.setEnabled(false);
			btnUsuario.setEnabled(false);
			btnReporte.setEnabled(false);
			btnSolicitud.setEnabled(false);
			
		}
		
		if(user instanceof Candidato) {
			btnEmpresa.setEnabled(false);
			btnCandadito.setEnabled(true);
			btnUsuario.setEnabled(false);
			btnReporte.setEnabled(false);
			btnSolicitud.setEnabled(false);
			

		}
		
		Image img = new ImageIcon(this.getClass().getResource("/Untitled-2.png")).getImage();
		imageLogin.setIcon(new ImageIcon(img));
		
		JLabel lblCerrarSesion = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCerrarSesion.setBounds(764, 395, 83, 14);
		panel.add(lblCerrarSesion);
	}
}
