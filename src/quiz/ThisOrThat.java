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
public class ThisOrThat extends MultipleChoice {
    private String answer1;
    private String answer2;
    private String answer;
    
    public ThisOrThat(String question, String answer1, String answer2, int correctAnswer, int score){
        super(question, new  String [] {answer1, answer2}, correctAnswer, score); 
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer = this.getAnswer();
    }
       
    public ThisOrThat(String question, String answer1, String answer2, int correctAnswer){
        super(question, new  String [] {answer1, answer2}, correctAnswer);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer = this.getAnswer();        
    }
    
    @Override
    public boolean isCorrect(String ans) {
        if ((this.answer.getClass() != ans.getClass()) || ans == null) {
            return false;
        } else {
            return this.answer.equalsIgnoreCase(ans);
        }
    }

    @Override
    public String toString() {
        return (answer1 + " or " + answer2 + ": " + this.getQuestion());
    }
}
