package Models;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

public class AnswerAQuestion {

    private String question;
    public String answer;
    private ResourceBundle resourceBundle;

    public AnswerAQuestion() {

        File file = new File("C:\\Users\\ANAIS\\Desktop\\Projet\\LP24_Project\\SnakesAndLadders\\resources\\properties");
        URL[] urls = new URL[0];
        try {
            urls = new URL[]{file.toURI().toURL()};
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ClassLoader loader = new URLClassLoader(urls);
        resourceBundle = ResourceBundle.getBundle("questions", Locale.ENGLISH, loader);
    }

    public void generateQuestionAnswer() {

        String questionAndAnswer = (String)this.resourceBundle.getObject(Integer.toString((int) (Math.random() * 85) + 1));

        int index = questionAndAnswer.indexOf('.');
        this.question = questionAndAnswer.substring(0, index);
        this.answer = questionAndAnswer.substring(++index);
    }

    public String getQuestion() {

        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }
}
