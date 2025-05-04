package lifeline;

import game.Question;
import java.util.Random;

public class FiftyFifty implements Lifeline {
    @Override
    public void useLifeline(Question question) {
        System.out.println("🎯 50:50 Lifeline Activated:");
        String[] options = question.getOptions();
        int correct = question.getCorrectIndex();
        boolean shownCorrect = false;
        Random rand = new Random();
        while (!shownCorrect) {
            int randIndex = rand.nextInt(4);
            if (randIndex != correct) {
                for (int i = 0; i < options.length; i++) {
                    if (i == correct || i == randIndex) {
                        System.out.println((i + 1) + ". " + options[i]);
                    }
                }
                shownCorrect = true;
            }
        }
    }
}
