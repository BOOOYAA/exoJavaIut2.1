import javax.swing.*;
import java.awt.*;
class Fenetre extends JFrame {
	protected JCheckBox bCyan;
	protected JCheckBox bMagenta;
	protected JCheckBox bJaune;
	protected JPanel pan;
	
	public Fenetre(String x){
		super(x);
		pan = new JPanel();
		
		Dimension dim = new Dimension(300,220);
		bCyan = new JCheckBox("Cyan");
		bMagenta = new JCheckBox("Magenta");
		bJaune = new JCheckBox("Jaune");

		pan.add(bCyan);
		pan.add(bMagenta); 
		pan.add(bJaune);

		this.add(pan,BorderLayout.CENTER);
		this.setMinimumSize(dim);
		this.setPreferredSize(dim);
    	this.setLocation(0,0);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}