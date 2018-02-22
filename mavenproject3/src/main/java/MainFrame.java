
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {

    public void create() {
        JFrame window = new JFrame("Aplication");
        window.setVisible(true);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel();
        l.setSize(350,100);
        l.setBounds(200, 200, 200,200);
        l.setText("Submit Button clicked.");
//        l.setVisible(true);
        window.add(l);

        JPanel panel = new JPanel();
//        panel.setBackground(Color.red);
        panel.setLayout(null);
        panel.setBounds(0, 0, 100, 101);
        window.add(panel);
        panel.add(l);

        JButton[] buttons = new JButton[4];
        String[] names = {"^", "v", "<", ">"};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(names[i]);
            System.out.println(buttons[i].getText());
            panel.add(buttons[i]);
        }

        buttons[0].setBounds(50, 0, 50, 50);
        buttons[1].setBounds(50, 100, 50, 50);
        buttons[2].setBounds(0, 50, 50, 50);
        buttons[3].setBounds(100, 50, 50, 50);

        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("naaajs");
                
            }
        });
    }
}
