import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    GamePanel panel;
    static JButton restart;


    GameFrame(){
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        //this.setLayout(null);
        this.setResizable(false);
        //this.pack();
        this.setLocationRelativeTo(null);

        restart = new JButton();
        restart.setText("Reset");
        restart.setSize(100, 50);
        restart.setLocation(300, 400);
        restart.addActionListener(this);
        panel = new GamePanel();

        this.add(restart);
        this.add(panel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==restart) {
            this.remove(panel);
            panel = new GamePanel();
            this.add(panel);
            panel.requestFocusInWindow();
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}
