
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {

    public void create() {
        //add and set Frame
        JFrame window = new JFrame("Aplication");
        window.setVisible(true);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //add and set Label
//        ImageIcon img =new ImageIcon(getClass().getResource("ball.png"));
        JLabel l = new JLabel("Ball");
//        l.setIcon(new ImageIcon("ball.png"));
        l.setSize(60, 60);
        l.setBounds(200, 200, 200, 200);
        window.add(l);

        //add and set Panel
        JPanel panel = new JPanel();
//        panel.setBackground(Color.red);
        panel.setLayout(null);
        panel.setBounds(0, 0, 100, 100);
        window.add(panel);
        panel.add(l);

        // create 4 buttons
        JButton[] buttons = new JButton[4];
        String[] names = {"^", "v", "<", ">"};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(names[i]);
            panel.add(buttons[i]);
        }

        buttons[0].setBounds(50, 0, 50, 50);
        buttons[1].setBounds(50, 100, 50, 50);
        buttons[2].setBounds(0, 50, 50, 50);
        buttons[3].setBounds(100, 50, 50, 50);

        //move up
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Point point = l.getLocation();
                int x = point.x;
                int y = point.y;

                l.setLocation(x, y - 40);
            }
        });

        //move down
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Point point = l.getLocation();
                int x = point.x;
                int y = point.y;

                l.setLocation(x, y + 40);
            }
        });

        //move left
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Point point = l.getLocation();
                int x = point.x;
                int y = point.y;

                l.setLocation(x - 40, y);
            }
        });

        //move right
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Point point = l.getLocation();
                int x = point.x;
                int y = point.y;

                l.setLocation(x + 40, y);
            }
        });

    }
}
