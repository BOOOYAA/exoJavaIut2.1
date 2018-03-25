import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fenetre extends JFrame {
	private JLabel[] tab ;
	public Fenetre(String x){
		super(x);
		this.tab	=new JLabel[10];
		this.tab[0] =new JLabel("The room");
		this.tab[1] =new JLabel("Shining");
		this.tab[2] =new JLabel("Fight Club");
		this.tab[3] =new JLabel("Alien");
		this.tab[4] =new JLabel("Donnie Darco");
		this.tab[5] =new JLabel("Puple Fiction");
		this.tab[6] =new JLabel("Toy Story");
		this.tab[7] =new JLabel("King Kong");
		this.tab[8] =new JLabel("The Godfather");
		this.tab[9] =new JLabel("Goodfellas");

		Dimension dim = new Dimension(200,180);
		this.setLayout(new GridLayout(10,1));
		for (int i=0;i<10;i++){
			tab[i].setOpaque(true);
			tab[i].setBackground(Color.WHITE);
			this.add(this.tab[i],BorderLayout.CENTER);
		}
		this.setMinimumSize(dim);
		this.setMaximumSize(dim);
		this.setPreferredSize(dim);
    	this.setLocationRelativeTo(null);//Place la fenetre au centre de l'écran
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public JLabel envoie(int x){
    	return this.tab[x];
    }
} 