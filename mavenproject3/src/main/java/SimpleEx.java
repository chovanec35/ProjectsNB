
import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleEx {

    public static void main(String[] args) {
        JFrame window = new JFrame("");
        window.setVisible(true);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setLayout(null);
        panel.setBounds(0, 0, 100, 100);
        window.add(panel);

        ArrayList<JButton> buttons = new ArrayList();
        String[] name = {"<",">","v", "^"};

        JButton button1 = new JButton("^");
        button1.setBounds(50, 0, 50, 50);
        panel.add(button1);

        JButton button2 = new JButton("v");
        button2.setBounds(50, 100, 50, 50);
        panel.add(button2);

        JButton button3 = new JButton("<");
        button3.setBounds(0, 50, 50, 50);
        panel.add(button3);

        JButton button4 = new JButton(">");
        button4.setBounds(100, 50, 50, 50);
        panel.add(button4);
    }

}
