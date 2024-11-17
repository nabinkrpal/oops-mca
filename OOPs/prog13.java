import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// MouseEventDemo  {
public class prog13 extends JFrame implements MouseListener, WindowListener {

    public prog13() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(this);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Click and move your mouse here!", 100, 100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the window.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the window.");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing.");
        System.exit(0); // Exit the application
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated.");
    }

    public static void main(String[] args) {
        prog13 frame = new prog13();
        frame.setVisible(true);
    }
}