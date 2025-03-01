import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyFrame extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    Music music = new Music();

    MyFrame() {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button1.setBounds(200, 100, 100, 50);
        button1.addActionListener(this);
        button2.setBounds(100, 100, 100, 50);
        button2.addActionListener(this);
        button3.setBounds(300, 100, 100, 50);
        button3.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            music.play();
        } else if (e.getSource() == button2) {
            music.pause();
        }
    }
}
