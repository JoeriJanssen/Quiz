/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class View {

    List<Question> questions;
    List<Question> secondTime;
    Scanner scan;

    public View() {
        this.scan = new Scanner(System.in);
        this.questions = new LinkedList<>();
        this.secondTime = new LinkedList<>();
        questions.add(new OpenQuestion("What is the  complexity  of a binary  search?", "O(log N)", 2));
        questions.add(new OpenQuestion("What is the  minimal  amount of  constructors  for a Java  class?", "0"));
        questions.add(new MultipleChoice("What is the  best  achievable  complexity  of in situ  sorting?",
                new String[]{"O(N^2)", "O(N log N)", "O(N)", "O(log N)"}, 1, 4));
        questions.add(new MultipleChoice("How do you  print \" Hello  world\" on a line in Java?",
                new String[]{"System.out.print (\" Hello  world \");", "System.out.println (\" Hello  world \");", "cout  << \" Hello  world \";"}, 1));
        questions.add(new ThisOrThat("Is there a differnece between abstract classes and interfaces in Java?", "Yes", "No", 0, 2));
        questions.add(new ThisOrThat("Each class definition must have a constructor.", "Right", "Wrong", 0));
    }

    private int askQuestions(List<Question> questions, Boolean first) {
        int total = 0;
        for (Question q : questions) {
            System.out.println(q);
            String answer = scan.nextLine();
            if (q.isCorrect(answer)) {
                System.out.println("Good");
                total += q.getScore();
            } else {
                System.out.println("Stupid!");
                if(first) secondTime.add(q);
            }
        }

        return total;
    }

    public void Start() {
        int firstscore = askQuestions(questions, true);
        System.out.println("Second round:\n");
        int secondscore = askQuestions(secondTime, false);
        System.out.println("Score first round: "+ firstscore + "\nScore second round: "+secondscore);
        

    }

}
