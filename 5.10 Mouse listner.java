// Mouse listener program 
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("MouseListener Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a MouseListener to the frame
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}