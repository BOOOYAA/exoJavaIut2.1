import java.awt.Font;
import java.awt.Graphics;
/*dessiner un etoile simpliste*/
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TryPolygone extends JPanel {

  public void paint(Graphics g) {
    int xpoints[] = {0, 125,150,175,300,175,150,125};
    int ypoints[] = {125, 100,0,100,125,150,250,150};
    int npoints = 8;
    
    g.drawPolygon(xpoints, ypoints, npoints);

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.add(new TryPolygone());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20,20, 500,500);
    frame.setVisible(true);
  }
}