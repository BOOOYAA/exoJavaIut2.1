
import javax.swing.*;
import java.awt.*;
class Question3 {
		public static void main(String[] args){
			if (args.length>=1) {						
				JFrame fen = new JFrame("Question3");
				//fen.setLayout(null);
				GridLayout gestionnaire = new GridLayout(4,(args.length/4));
				
				Dimension dim = new Dimension(200,180);
				JLabel Courses = new JLabel("Courses");
				JPanel panneau = new JPanel();
				panneau.setLayout(gestionnaire);
				Courses.setVerticalAlignment(JLabel.BOTTOM);
				Courses.setHorizontalAlignment(JLabel.CENTER);
				fen.pack();
				fen.setMinimumSize(dim);
				fen.setPreferredSize(dim);
		    	fen.setLocation(0,0);
		    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    	fen.add(Courses,BorderLayout.NORTH);
		    	
		    	for (int i=0;i< args.length ; i++) {
		    		panneau.add(new JCheckBox(args[i]),BorderLayout.CENTER);
				}
		    	fen.add(panneau,BorderLayout.CENTER);
		    	fen.setVisible(true);
			}else
				System.out.println("argument !");
		}

}
