import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JPanel contentPane;
	 	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public Principal() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane= new JPanel();
		contentPane.setLayout(new BorderLayout());
		frame.setContentPane(contentPane);
		cambiarPanel( new PanelRojo(this));
	        
	       
	
		}
	 public void cambiarPanel(JPanel panel) {
	        contentPane.removeAll();
	        contentPane.add(panel, BorderLayout.CENTER);
	        contentPane.revalidate();
	        contentPane.repaint();
	    }
	

	

}
