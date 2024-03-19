import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelRojo extends JPanel {
	

public PanelRojo(Principal principal) {
	
	
	setBackground(Color.RED); 
	JButton btnNewButton = new JButton("Cambiar a azul");
	btnNewButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			principal.cambiarPanel(new PanelAzul(principal));
		}
		
	});
	this.add(btnNewButton);
	

	
	
}
	

}
