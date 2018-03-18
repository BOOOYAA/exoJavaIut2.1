import java.awt.*;
import javax.swing.*;

public class Peinture extends JComponent {
	protected boolean fenetre_arriere;
	
	public void etat_de(boolean x){
		this.fenetre_arriere=x;//soir si la fenetre est en arriere plan ou non
	}
	@Override
	public void paintComponent(Graphics pinceau){
		Graphics sndpinceau = pinceau.create();
		if(this.isOpaque()){
			sndpinceau.setColor(Color.CYAN);
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
		if(fenetre_arriere){ //si elle l'est on a fiiche un sablier 
			int[] tabx={0, this.getWidth(),0,this.getWidth()};
			int[] taby={0, this.getHeight(),this.getHeight(),0};
			sndpinceau.setColor(Color.GREEN);
      		sndpinceau.fillPolygon(tabx,taby,4);//4 corespond au nombre de pts  dans les tableaux
		}else{//sinon non
			sndpinceau.setColor(Color.GREEN);
			sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
			sndpinceau.setColor(Color.MAGENTA);
	    	sndpinceau.fillArc(0,0, this.getWidth(),this.getHeight(),0,360);
			}
		}
	}		
	

