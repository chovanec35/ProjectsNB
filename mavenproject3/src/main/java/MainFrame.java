
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {

    public void create(){
        JFrame window = new JFrame("");
        window.setVisible(true);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setLayout(null);
        panel.setBounds(0, 0, 100, 101);
        window.add(panel);

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
    }
}
