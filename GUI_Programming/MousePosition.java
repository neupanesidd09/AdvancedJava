import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.MouseEvent;

public class MousePosition {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Coordinate finding");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Local Position -> X: " + e.getX() + ", Y: " + e.getY());
            }
        });

        frame.setVisible(true);
    }
}