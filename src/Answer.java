public class Answer {
    private final Question question;
    private final int answer;

    public Answer(Question question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Вопрос - " + question.getQuestionText() +
                "\nВаш ответ - " + answer +
                "\nПравильный ответ - " + question.getRightAnswer() + "\n";
    }
}
