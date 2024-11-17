import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// ItemEventDemo
public class prog14 extends JFrame {
    private JComboBox<String> comboBox;
    private JButton openChildButton;

    public prog14() {
        setTitle("Item Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = (String) e.getItem();
                    System.out.println("Selected item: " + selectedItem);
                }
            }
        });

        openChildButton = new JButton("Open Child Frame");
        openChildButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChildFrame childFrame = new ChildFrame();
                childFrame.setVisible(true);
            }
        });

        add(comboBox);
        add(openChildButton);
    }

    public static void main(String[] args) {
        prog14 frame = new prog14();
        frame.setVisible(true);
    }

    class ChildFrame extends JFrame {
        public ChildFrame() {
            setTitle("Child Frame");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLayout(new FlowLayout());

            JLabel label = new JLabel("This is a child frame.");
            add(label);
        }
    }
}