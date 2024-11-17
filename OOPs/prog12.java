import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// RectangleCheck 
public class prog12 extends JFrame implements MouseMotionListener {
    private Rectangle rectangle;

    public prog12() {
        setTitle("Rectangle Check");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseMotionListener(this);

        rectangle = new Rectangle(100, 100, 150, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (rectangle.contains(x, y)) {
            setTitle("Mouse is inside the rectangle");
        } else if (getBounds().contains(x, y)) {
            setTitle("Mouse is inside the window, but outside the rectangle");
        } else {
            setTitle("Mouse is outside the window");
        }
    }
    @Override
    public void mouseDragged(MouseEvent e) {
    }


    public static void main(String[] args) {
        prog12 frame = new prog12();
        frame.setVisible(true);
    }
}