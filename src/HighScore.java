import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class HighScore {
    static int highScore = 0;
    HighScore() {
        try {
            File hiScore = new File("highscore.txt");
            Scanner score = new Scanner(hiScore);
            while(score.hasNext()) {
                highScore = Integer.parseInt(score.next());
            }
            score.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void setHighScore(int s){
        highScore = s;
        try {
            Formatter hiScore = new Formatter("highscore.txt");
            hiScore.format("%s", highScore);
            hiScore.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        }
    }

