import javax.swing.*;
import java.awt.*;

public class Homework1 {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    private JTextField textField;
    private JTextField textField2;

    public static void main(String[] args) {
        Homework1 p = new Homework1();
    }

    public Homework1(){
        frame = new JFrame("Example with grid layout");
        panel = new JPanel(new BorderLayout(2,2));
        button = new JButton("button 1");
        label = new JLabel("Label1!");
        textField = new JTextField("this is a text field!");
        textField2 = new JTextField("this is a text area yay!");

        panel.add(label, BorderLayout.WEST);
        panel.add(button, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.SOUTH);
        panel.add(textField2, BorderLayout.CENTER);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
