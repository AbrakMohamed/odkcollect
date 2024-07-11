package org.odk.collect.android.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.ProjectForm;
import org.odk.collect.android.activities.viewmodels.Question;
import org.odk.collect.android.activities.viewmodels.Rubric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetailActivity extends BaseActivity {

    private ProjectForm projectForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setupToolbar();

        TextView textViewProjectName = findViewById(R.id.textViewProjectName);
        TextView textViewProjectLocation = findViewById(R.id.textViewProjectLocation);
        TextView textViewProjectDate = findViewById(R.id.textViewProjectDate);
        Button startFormButton = findViewById(R.id.start_form_button);

        String projectName = getIntent().getStringExtra("projectName");
        String projectLocation = getIntent().getStringExtra("projectLocation");
        String projectDate = getIntent().getStringExtra("projectDate");

        textViewProjectName.setText(projectName);
        textViewProjectLocation.setText(projectLocation);
        textViewProjectDate.setText(projectDate);

        // Simuler la récupération du formulaire du projet pour l'exemple
        projectForm = getProjectForm(projectName);

        startFormButton.setOnClickListener(v -> {
            Intent intent = new Intent(DetailActivity.this, FormActivity.class);
            intent.putExtra("projectForm", projectForm);
            startActivity(intent);
        });
    }

    private ProjectForm getProjectForm(String projectName) {
        List<Rubric> rubrics = new ArrayList<>();

        switch (projectName) {
            case "Nom projet 1":
                rubrics.add(createRubric("Rubric 1",
                        new Question("Question 1", "radio", Arrays.asList("Rep A", "Rep B", "Rep C")),
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                rubrics.add(createRubric("Rubric 2",
                        new Question("Question 3", "radio", Arrays.asList("Rep A", "Rep B")),
                        new Question("Question 4", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                break;

            case "Nom projet 2":
                rubrics.add(createRubric("Rubric 1",
                        new Question("Question 1", "radio", Arrays.asList("Rep A", "Rep B")),
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C", "Rep D"))
                ));
                rubrics.add(createRubric("Rubric 2",
                        new Question("Question 3", "radio", Arrays.asList("Rep A", "Rep B")),
                        new Question("Question 4", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C", "Rep D"))
                ));
                break;

            case "Nom projet 3":
                rubrics.add(createRubric("Rubric 1",
                        new Question("Question 1", "radio", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                rubrics.add(createRubric("Rubric 2",
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                break;

            case "Nom projet 4":
                rubrics.add(createRubric("Rubric 1",
                        new Question("Question 1", "checkbox", Arrays.asList("Rep A","Rep B","Rep C","Rep D")),
                        new Question("Question 2", "radio", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                rubrics.add(createRubric("Rubric 2",
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                break;

            case "Nom projet 5":
                rubrics.add(createRubric("Rubric 1",
                        new Question("Question 1", "checkbox", Arrays.asList("Rep A","Rep B","Rep C","Rep D")),
                        new Question("Question 2", "radio", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                rubrics.add(createRubric("Rubric 2",
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C")),
                        new Question("Question 3", "radio", Arrays.asList("Rep A", "Rep B"))
                ));
                break;

            default:
                rubrics.add(createRubric("Default Rubric",
                        new Question("Default Question", "radio", Arrays.asList("Rep A", "Rep B"))
                ));
                break;
        }

        return new ProjectForm(projectName, rubrics);
    }

    private Rubric createRubric(String rubricName, Question... questions) {
        List<Question> questionList = new ArrayList<>(Arrays.asList(questions));
        return new Rubric(rubricName, questionList);
    }
}
