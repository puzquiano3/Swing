import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelAzul extends JPanel {
	

public PanelAzul(Principal principal) {
	
	
	setBackground(Color.BLUE); 
	JButton btnNewButton = new JButton("Cambiar a rojo");
	btnNewButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			principal.cambiarPanel(new PanelRojo(principal));
		}
		
	});
	this.add(btnNewButton);

	
	
}
	

}