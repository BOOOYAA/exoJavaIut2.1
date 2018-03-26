import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Volume extends JComponent{
	private int a;
	
	public Volume(){
		super();
		this.a=(int)(Math.random() * 10);
	}

	@Override
	public void paintComponent(Graphics pinceau){
		Graphics sndpinceau = pinceau.create();
		
		if(this.isOpaque()){
			 // on repeint toute la surface avec la couleur de fond
      		sndpinceau.setColor(this.getBackground());
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
		sndpinceau.setColor(Color.BLACK);
      	sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());	

    	for (int i=0;i<10;i++) {
    		if (i<=this.a)
    			sndpinceau.setColor(Color.RED);
    		else
    			sndpinceau.setColor(Color.WHITE);
    		
    		sndpinceau.fillArc(((this.getWidth()/10)*i)+8, this.getHeight()/4, this.getWidth()/10,this.getHeight()/2,0,360);	
    	}
    }
    public void alteration(int x){
    	if(x<0){
            if(a>=0)
    		  this.a--;
        }
        else{
            if(a<11)
                this.a++;
        }
    	   
           this.repaint();
           System.out.println("a :"+this.a);
    }	
}