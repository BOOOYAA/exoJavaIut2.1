import javax.swing.*;
import java.awt.*;

class Fenetre extends JFrame {
	public Fenetre(String str){
		super(str);
		this.setSize(200,200);
    	this.setLocation(0,0);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}