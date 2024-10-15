import javax.swing.*;
import java.awt.*;

public class Homework2 {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JButton button2;
    private JLabel label2;
    private JTextField textField;

    public static void main(String[] args) {
        Homework2 p = new Homework2();
    }

    public Homework2(){
        frame = new JFrame("Example with grid layout");
        panel = new JPanel(new GridLayout(2,2));
        button = new JButton("button 1");
        label = new JLabel("Label1!");
        button2 = new JButton("button 2");
        label2 = new JLabel("label2!");

        panel.add(label);
        panel.add(button);
        panel.add(button2);
        panel.add(label2);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }


}
