package Views;

import Models.AnswerAQuestion;

import javax.swing.*;

public class QuestionDialog {

    private AnswerAQuestion answerAQuestion;

    public QuestionDialog() {

        answerAQuestion = new AnswerAQuestion();
    }

    public boolean askQuestion() {

        answerAQuestion.generateQuestionAnswer();
        Object[] options = {"TRUE",
                "FALSE"};

        int choice = JOptionPane.showOptionDialog(null,
                answerAQuestion.getQuestion(),
                "True or False ?",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title

        return choice == 0 && answerAQuestion.getAnswer().equals("TRUE") || choice == 1 && answerAQuestion.getAnswer().equals("FALSE");
    }
}
