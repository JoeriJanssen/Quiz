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
public class OpenQuestion extends Question {

    public OpenQuestion(String question, String answer, int score) {
        super(question, answer, score);
    }

    public OpenQuestion(String question, String answer) {
        super(question, answer);
    }

}
