import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Music {

    private Clip clip;
    private boolean isPaused;
    private boolean isRunning;
    private boolean isLooping;

    public void play() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
        //String filepath = "/home/uelmcneill/IdeaProjects/MusicPlayer/src/gardens-stylish-chill-303261.wav";
        String filepath = "/Users/uelmc/IdeaProjects/MusicPlayer/src/gardens-stylish-chill-303261.wav";
        File file = new File(filepath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            if (isLooping) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            clip.start();
            //isRunning = true;
            System.out.println("No problems detected");
        } catch (FileNotFoundException e) {
        System.out.println("FIle not found");
        } catch(IOException e) {
        System.out.println("Something went wrong.");
        } catch (UnsupportedAudioFileException e) {
        System.out.println("Audio file is not supported.");
        } catch (LineUnavailableException e) {
        System.out.println("Unable to read the file.");
        } finally {
        System.out.println("Bye!");
    }
    }
    public void pause(JButton pauseButton) {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            isPaused = true;
            pauseButton.setText("Resume");
        } else if (clip != null && isPaused) {
            clip.start();

            if (isLooping) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }

            isPaused = false;
            pauseButton.setText("Pause");
        }
    }
}


