import javax.swing.*;
import java.awt.*;
class Fenetre extends JFrame {
	protected JPanel pan;
	protected JTextField jtf;
	public Fenetre(String x){
		super(x);
		pan = new JPanel();
		jtf = new JTextField();
		pan.add(jtf,BorderLayout.CENTER);
		jtf.setLocation(99,90);
		jtf.setPreferredSize(new Dimension(170,30));//setSize marche pas 
		Dimension dim = new Dimension(300,220);
		
		this.add(pan,BorderLayout.CENTER);
		this.setMinimumSize(dim);
		this.setMaximumSize(dim);
		this.setPreferredSize(dim);
    	this.setLocation(0,0);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}