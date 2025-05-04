package lifeline;

import game.Question;

public class AudiencePoll implements Lifeline {
    @Override
    public void useLifeline(Question question) {
        System.out.println("📊 Audience Poll:");
        String[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (i == question.getCorrectIndex()) {
                System.out.println((i + 1) + ". " + options[i] + " - 70%");
            } else {
                System.out.println((i + 1) + ". " + options[i] + " - 10%");
            }
        }
    }
}
