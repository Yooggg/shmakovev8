import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Answer> answers = new ArrayList<>();
        questions.add(0,new Question("Что такое конструктор у класса?\n",
                Arrays.asList("1.метод, который вызывается при создании экземпляра объекта","2.специальная переменная класса","3.объект класса"), 1));

        questions.add(1,new Question("Если у класса в теле не объявлен конструктор тогда\n",
                Arrays.asList("1.у данного класса автоматически создается конструктор по умолчанию","2.нельзя создать объект этого класса","3.код не скомпилируется"),1));

        questions.add(2,new Question("Сколько конструкторов может быть у класса?\n",
                Arrays.asList("1.неограниченное количество","2.только один","3.не более пяти"),1));

        questions.add(3,new Question("Переменные в классе инициализируется \n",
                Arrays.asList("1.в порядке их объявления", "2.все одновременно","3.в случайном порядке"),1));

        questions.add(4,new Question("Для каких целей служат методы get и set\n",
                Arrays.asList("1.чтобы другие классы могли корректно получать или менять данные внутри объектов вашего класса","2.это специальные конструкторы класса"),1));


        int count = questions.size();
        for (Question num: questions) {
            System.out.println(num.getQuestionText());
            for (String list : num.getAnswerVariants()) {
                System.out.println(list);
            }
            answers.add(questions.indexOf(num),new Answer(num,scanner.nextInt()));
            if (num.getRightAnswer() != answers.get(questions.indexOf(num)).getAnswer()) {
                count--;
            }
            System.out.println("\n");
        }

        if (count == questions.size()){
            System.out.println("Вы ответили на "+ count + " из " + questions.size() + " вопросов.\n");
        }
        else {
            System.out.println("Вы ответили на "+ count + " из " + questions.size() + " вопросов. Вы ошиблись в следующих вопросах: \n");
        }

        for (Question num: questions) {
            if (num.getRightAnswer() != answers.get(questions.indexOf(num)).getAnswer()){
                System.out.println(answers.get(questions.indexOf(num)));
            }
        }

    }
}