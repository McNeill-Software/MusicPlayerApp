import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Music {

    private Clip clip;
    private boolean isPaused;
    private boolean isRunning = true;
    private boolean isLooping;

    public void play() {
        if (clip != null) {
            clip.stop();
        }
        //String filepath = "/home/uelmcneill/IdeaProjects/MusicPlayer/src/gardens-stylish-chill-303261.wav";
        String filepath = "/Users/uelmc/IdeaProjects/MusicPlayer/src/gardens-stylish-chill-303261.wav";
        File file = new File(filepath);
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            isRunning = true;
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
    public void pause() {
        if (clip.isRunning()) {
            clip.stop();
        }
    }
}


