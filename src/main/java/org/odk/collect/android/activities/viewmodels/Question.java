package org.odk.collect.android.activities.viewmodels;

import java.io.Serializable;
import java.util.List;

public class Question implements Serializable {
    private String questionText;
    private String questionType; // "radio", "text", "checkbox"
    private List<String> answers;
    private String selectedAnswer;

    public Question(String questionText, String questionType, List<String> answers) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.answers = answers;


    }
    public Question(String questionText, String questionType, List<String> answers, String selectedAnswer) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.answers = answers;
        this.selectedAnswer = selectedAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    // Méthode pour vérifier si la question a été répondue
    public boolean isAnswered() {
        return selectedAnswer != null && !selectedAnswer.isEmpty();
    }
}
