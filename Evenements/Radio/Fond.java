import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fond implements ActionListener {
	 private JPanel panneau;
	 public void actionPerformed(ActionEvent evenement){
	 	String txt=evenement.getActionCommand();
	 	if (txt=="Cyan") {
	 		panneau.setBackground(Color.CYAN);
	 	}
	 	else if(txt=="Magenta") {
	 		panneau.setBackground(Color.MAGENTA);
	 	}else if(txt=="Jaune") {
	 		panneau.setBackground(Color.YELLOW);
	 	}
	 	}

	 public Fond(JPanel pan){
	 	this.panneau =pan;
	 }
}