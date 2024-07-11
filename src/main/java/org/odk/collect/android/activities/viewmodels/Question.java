package org.odk.collect.android.activities.viewmodels;

import java.io.Serializable;
import java.util.List;

public class Question implements Serializable {
    private String questionText;
    private String questionType; // "radio", "text", "checkbox"
    private List<String> answers;

    public Question(String questionText, String questionType, List<String> answers) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.answers = answers;
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
}
