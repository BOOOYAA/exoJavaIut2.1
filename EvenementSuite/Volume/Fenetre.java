import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fenetre extends JFrame {
	private Volume volume;
	private JPanel panneau;
	public Fenetre(String x){
		super(x);
		this.volume = new Volume();
		this.panneau = new JPanel();
		Dimension dim = new Dimension(1000,220);
		this.add(volume,BorderLayout.CENTER);
		this.setMinimumSize(dim);
		this.setMaximumSize(dim);
		this.setPreferredSize(dim);
    	this.setLocationRelativeTo(null);//Place la fenetre au centre de l'écran
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void lePont(int x){
    	this.volume.alteration(x);
    }
}