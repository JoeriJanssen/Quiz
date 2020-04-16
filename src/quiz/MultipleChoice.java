/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 * @author Jarek van Dijk, s4608070
 * @author Pleun Koldewijn, s4368029
 */
public class MultipleChoice extends Question {

    private final String[] answers;
    private final String alfabet = "abcdefghijklmnopqrstuvwxyz";
    private final int correctIndex;

    public MultipleChoice(String question, String[] answers, int correctAnswer, int score) {
        super(question, answers[correctAnswer], score);
        this.answers = answers;
        this.correctIndex = correctAnswer;
    }

    public MultipleChoice(String question, String[] answers, int correctAnswer) {
        super(question, answers[correctAnswer]);
        this.answers = answers;
        this.correctIndex = correctAnswer;
    }

    @Override
    public boolean isCorrect(String ans) {
        char anschar = ans.charAt(0);
        int index = alfabet.indexOf(anschar);
        if (index == correctIndex) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = (this.getQuestion() + '\n');
        for (int i = 0; i < answers.length; i++) {
            str = str + (alfabet.charAt(i) + ") " + answers[i] + '\n');
        }
        str = str.trim();
        return str;
    }

}
