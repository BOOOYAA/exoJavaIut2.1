import javax.swing.*;
import java.awt.*;

public class Damier{
	public static void main(String[] args){
		int dim = Integer.parseInt(args[0]);
		
		JFrame fen =new JFrame("Damier");

		fen.setSize(200,200);
		fen.setLocation(500,500);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int g = 0; 
		GridLayout grid = new GridLayout(dim,dim);
		fen.setLayout(grid);
		
			for (int i=0;i<dim;i++) {
				if(dim%2==0){
					g=0;
				}
				for(int j=0;j<dim;j++){
					JPanel a = new JPanel();
					if(  dim%2 == 0 && i%2 == 1 ){
						if(j%2==0){
							g=1;
						}else{
							g=0;
						}
					}
					if(g%2==0){
						a.setBackground(Color.BLACK);
					}else{
						a.setBackground(Color.WHITE);
					}
					fen.add(a);
					g++;
				}
			}

		fen.setVisible(true);
	}	
}