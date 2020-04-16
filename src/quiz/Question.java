/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Administrator
 */
public abstract class Question {

    private String question;
    private String answer;
    private int score;

    private void setScore(int s) {
        if (s < 1 || s > 5) {
            score = 3;
        } else {
            score = s;
        }
    }

    public Question(String quest, String ans) {
        this.question = quest;
        this.answer = ans;
        this.score = 3;
    }

    public Question(String quest, String ans, int s) {
        this.question = quest;
        this.answer = ans;
        setScore(s);
    }

    public String correctAnswer() {
        return answer;
    }

    public boolean isCorrect(String ans) {
        if ((this.answer.getClass() != ans.getClass()) || answer == null) {
            return false;
        } else {
            return this.answer.equalsIgnoreCase(ans);
        }
    }

    public String getQuestion() {
        return this.question;
    }
    
    public String getAnswer(){
        return this.answer;
    }

    public int getScore() {
        return this.score;
    }

    public String toString() {
        return (this.question);
    }
}
