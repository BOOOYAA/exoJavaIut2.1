import java.awt.*;
import javax.swing.*;
public class Cercle extends JComponent {
	private int r;
	private int g;
	private int b;

	public Cercle(int r,int g,int b){
		super();
		this.r=r;
		this.g=g;
		this.b=b;
	}

	@Override
	public void paintComponent(Graphics pinceau){
		Graphics sndpinceau = pinceau.create();
		
		if(this.isOpaque()){
			 // on repeint toute la surface avec la couleur de fond
      		sndpinceau.setColor(this.getBackground());
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
		sndpinceau.setColor(new Color(r,g,b));
    	sndpinceau.fillArc(0,0, this.getWidth(),this.getHeight(),0,360);
    	sndpinceau.setColor(Color.WHITE);
    	sndpinceau.fillArc(this.getWidth()/4, this.getHeight()/4, this.getWidth()/2,this.getHeight()/2,0,360);

	}
}