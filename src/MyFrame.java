import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton playButton;
    ImageIcon icon;
    JButton pauseButton;
    JButton button3;
    Music music = new Music();

    MyFrame() {
        playButton = new JButton();
        icon = new ImageIcon("/Users/uelmc/IdeaProjects/MusicPlayer/src/play-button.png");
        playButton.setIcon(icon);
        pauseButton = new JButton();
        button3 = new JButton();
        playButton.setBounds(200, 100, 100, 50);
        playButton.addActionListener(this);
        pauseButton.setBounds(100, 100, 100, 50);
        pauseButton.addActionListener(this);
        button3.setBounds(300, 100, 100, 50);
        button3.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Music Player");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(playButton);
        this.add(pauseButton);
        this.add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            music.play();
        } else if (e.getSource() == pauseButton) {
            music.pause(pauseButton);
        }
    }
}
