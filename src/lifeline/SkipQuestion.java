package lifeline;

import game.Question;

public class SkipQuestion implements Lifeline {
    @Override
    public void useLifeline(Question question) {
        System.out.println("⏩ Question skipped!");
    }
}
