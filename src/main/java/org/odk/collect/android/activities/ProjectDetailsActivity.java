package org.odk.collect.android.activities;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ViewGroup.LayoutParams;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.ProjectForm;
import org.odk.collect.android.activities.viewmodels.Rubric;
import org.odk.collect.android.activities.viewmodels.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectDetailsActivity extends AppCompatActivity {

    private ProjectForm projectForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);

        String projectName = getIntent().getStringExtra("projectName");
        projectForm = loadProjectForm(projectName);

        displayProjectDetails();
    }

    private ProjectForm loadProjectForm(String projectName) {
        // Charger les projets enregistrés depuis les préférences partagées
        SharedPreferences prefs = getSharedPreferences("saved_projects", MODE_PRIVATE);
        String projectData = prefs.getString(projectName, ""); // Utilisez le bon type de données

        // Reconstruire le ProjectForm à partir des données sauvegardées
        // Vous devrez probablement enregistrer et récupérer toutes les données nécessaires

        // Exemple simplifié :
        List<Rubric> rubrics = new ArrayList<>();
        rubrics.add(createRubric("Rubric 1",
                createQuestion("Question 1", "radio", Arrays.asList("Rep A", "Rep B", "Rep C"), "Rep A"),
                createQuestion("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"), "Rep B")
        ));
        rubrics.add(createRubric("Rubric 2",
                createQuestion("Question 3", "radio", Arrays.asList("Rep A", "Rep B"), "Rep B"),
                createQuestion("Question 4", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"), "Rep C")
        ));

        return new ProjectForm(projectName, rubrics);
    }

    private Rubric createRubric(String rubricName, Question... questions) {
        List<Question> questionList = new ArrayList<>(Arrays.asList(questions));
        return new Rubric(rubricName, questionList);
    }

    private Question createQuestion(String questionText, String questionType, List<String> answers, String selectedAnswer) {
        Question question = new Question(questionText, questionType, answers);
        question.setSelectedAnswer(selectedAnswer);
        return question;
    }

    @SuppressLint("StringFormatInvalid")
    private void displayProjectDetails() {
        TextView projectNameTextView = findViewById(R.id.project_name);
        projectNameTextView.setText(getString(R.string.project_details_title, projectForm.getProjectName()));

        LinearLayout container = findViewById(R.id.container);

        // Afficher les rubriques et leurs réponses
        for (Rubric rubric : projectForm.getRubrics()) {
            TextView rubricTextView = new TextView(this);
            rubricTextView.setText(getString(R.string.rubric_title, rubric.getName()));
            rubricTextView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            rubricTextView.setTextSize(16);
            rubricTextView.setPadding(0, 16, 0, 8);
            container.addView(rubricTextView);

            for (Question question : rubric.getQuestions()) {
                TextView questionTextView = new TextView(this);
                questionTextView.setText(getString(R.string.question_text_with_answer, question.getQuestionText(), question.getSelectedAnswer()));
                questionTextView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
                questionTextView.setPadding(0, 8, 0, 8);
                container.addView(questionTextView);
            }
        }
    }
}
