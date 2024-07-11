package org.odk.collect.android.activities.viewmodels;

import java.io.Serializable;
import java.util.List;

public class Rubric implements Serializable {
    private String name;
    private List<Question> questions;

    public Rubric(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}