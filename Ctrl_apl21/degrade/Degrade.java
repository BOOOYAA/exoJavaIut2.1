import java.awt.*;
import javax.swing.*;
public class Degrade extends JComponent {
	private int r;


	public Degrade(int r){
		super();
		this.r=r;
	}

	@Override
	public void paintComponent(Graphics pinceau){
		Graphics sndpinceau = pinceau.create();
		
		if(this.isOpaque()){
			 // on repeint toute la surface avec la couleur de fond
      		sndpinceau.setColor(this.getBackground());
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}

		sndpinceau.setColor(new Color(this.r,0,0));
    	sndpinceau.fillRect(0,0,2,this.getHeight());

	}
}