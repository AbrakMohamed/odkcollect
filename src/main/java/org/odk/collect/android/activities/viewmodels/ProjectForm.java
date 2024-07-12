package org.odk.collect.android.activities.viewmodels;

import java.io.Serializable;
import java.util.List;

public class ProjectForm implements Serializable {
    private String projectName;
    private List<Rubric> rubrics;

    public ProjectForm(String projectName, List<Rubric> rubrics) {
        this.projectName = projectName;
        this.rubrics = rubrics;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Rubric> getRubrics() {
        return rubrics;
    }

    public boolean isCompleted() {
        for (Rubric rubric : rubrics) {
            for (Question question : rubric.getQuestions()) {
                if (question.getSelectedAnswer() == null || question.getSelectedAnswer().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
}
