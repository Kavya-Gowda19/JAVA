package game;
import lifeline.*;
public class QuizGame {
    private String name, city;
    private int age, currentQuestionIndex = 0;
    private int prizeMoney = 0;
    private static final int[] prizeChart = {1000, 2000, 3000, 5000, 10000, 20000, 40000, 80000, 160000, 320000};
    private Question[] questions;
    private boolean[] lifelinesUsed = {false, false, false}; // Audience, 50:50, Skip

    public QuizGame(String name, int age, String city, Question[] questions) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.questions = questions;
    }

    public Question getCurrentQuestion() {
        if (currentQuestionIndex < questions.length)
            return questions[currentQuestionIndex];
        else
            return null;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
    public int getCurrentPrize() { return prizeMoney; }
    public boolean isGameOver() { return currentQuestionIndex >= questions.length; }

    public boolean answer(int selectedOption) {
        Question q = getCurrentQuestion();
        boolean correct = q.getCorrectIndex() == selectedOption;
        if (correct) {
            prizeMoney = prizeChart[currentQuestionIndex];
            currentQuestionIndex++;
        } else {
            if (currentQuestionIndex < 5) prizeMoney = prizeChart[0];
            else prizeMoney = prizeChart[4];
            currentQuestionIndex = questions.length; // End game
        }
        return correct;
    }

    public boolean useLifeline(int lifelineIndex) {
        if (lifelineIndex < 0 || lifelineIndex > 2 || lifelinesUsed[lifelineIndex]) return false;
        lifelinesUsed[lifelineIndex] = true;
        Lifeline lifeline;
        switch (lifelineIndex) {
            case 0: lifeline = new AudiencePoll(); break;
            case 1: lifeline = new FiftyFifty(); break;
            case 2: lifeline = new SkipQuestion(); currentQuestionIndex++; return true;
            default: return false;
        }
        lifeline.useLifeline(getCurrentQuestion());
        return true;
    }

    public boolean[] getLifelineStatus() {
        return lifelinesUsed;
    }
}

