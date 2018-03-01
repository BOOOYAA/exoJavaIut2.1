import javax.swing.*;
import java.awt.*;

class Nuancier extends JPanel  {
	public Nuancier(int a, int b, int c){
    	super();
    	Color col = new Color(a,b,c);
    	Color noir = new Color(5,5,5);
    	Color blanc = new Color(255,255,255);
		Dimension dim = new Dimension(100,100);
		Dimension dimlab = new Dimension(200,21);
		this.setPreferredSize(dim);
		this.setBackground(col);
		JLabel la = new JLabel(a+","+b+","+c,JLabel.CENTER);
		la.setOpaque(true);
		la.setForeground(blanc);
		la.setBackground(noir);
		la.setPreferredSize(dimlab);
		this.add(la,BorderLayout.NORTH);
	}

}