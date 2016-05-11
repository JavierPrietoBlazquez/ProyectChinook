package view;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Javier Prieto Blázquez
 *
 */
public class vDiscs {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public vDiscs() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Discos");
		frame.setBounds(100, 100, 215, 135);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JLabel label = new JLabel("");
		menuBar.add(label);
		
		JMenu mnPrograma = new JMenu("Programa");
		menuBar.add(mnPrograma);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				
//				
//				
			}
		});
		mnPrograma.add(mntmSalir);
		
		JMenu mnArtistas = new JMenu("Artistas");
		menuBar.add(mnArtistas);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame vArtistSearch = new JFrame();
								
			}
		});
		mnArtistas.add(mntmBuscar);
		
		mnArtistas.addSeparator();
		
		JMenuItem mntmInsertar_1 = new JMenuItem("Insertar");
		mntmBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame vArtistAdd = new JFrame();
								
			}
		});
		mnArtistas.add(mntmInsertar_1);
		
		JMenu mnAlbumes = new JMenu("Albumes");
		menuBar.add(mnAlbumes);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Buscar");
		mntmBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame vAlbumSearch = new JFrame();
								
			}
		});
		mnAlbumes.add(mntmNewMenuItem);
		
		mnAlbumes.addSeparator();
		
		JMenuItem mntmInsertar = new JMenuItem("Insertar");
		mntmBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame vAlbumAdd = new JFrame();
								
			}
		});
		mnAlbumes.add(mntmInsertar);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vDiscs window = new vDiscs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
