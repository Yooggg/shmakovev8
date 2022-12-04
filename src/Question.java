
import java.util.List;

public class Question {
    private final String questionText;
    private final List<String> answerVariants;
    private final int rightAnswer;

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getAnswerVariants() {
        return answerVariants;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public Question(String questionText, List<String> answerVariants, int rightAnswer) {
        this.questionText = questionText;
        this.answerVariants = answerVariants;
        this.rightAnswer = rightAnswer;
    }
}
