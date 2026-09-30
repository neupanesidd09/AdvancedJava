import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapeExample extends JPanel{


    protected  void painComponent(Graphics g){
super.paintComponent(g);

Graphics2D graphics2D = new Graphics2D() {
    
    graphics2D.drawline(50,50,250,50);
};


    }

    public static void main(String[] args) {
      JFrame frame =  new JFrame();
      frame.setSize(500,800);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      

      frame.setVisible(true);
    }
}

//  Assginment:-      Rectangle, Square, Circle