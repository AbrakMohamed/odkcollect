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
        TextView textViewProjectLocationValue = findViewById(R.id.textViewProjectLocationValue);
        TextView textViewProjectDateValue = findViewById(R.id.textViewProjectDateValue);
        TextView textViewProjectTimeValue = findViewById(R.id.textViewProjectTimeValue);
        TextView textViewProjectTypologyValue = findViewById(R.id.textViewProjectTypologyValue);
        Button startFormButton = findViewById(R.id.start_form_button);

        String projectName = getIntent().getStringExtra("projectName");
        String projectLocation = getIntent().getStringExtra("projectLocation");
        String projectDate = getIntent().getStringExtra("projectDate");
        String projectTypology = getIntent().getStringExtra("projectTypology");

        textViewProjectName.setText(projectName);
        textViewProjectLocationValue.setText(projectLocation);
        textViewProjectDateValue.setText(getFormattedDate(projectDate));
        textViewProjectTimeValue.setText(getFormattedTime(projectDate));
        textViewProjectTypologyValue.setText(projectTypology);

        // Charger le formulaire du projet en fonction de la typologie
        projectForm = getProjectForm(projectName, projectTypology);

        startFormButton.setOnClickListener(v -> {
            Intent intent = new Intent(DetailActivity.this, FormActivity.class);
            intent.putExtra("projectForm", projectForm);
            startActivity(intent);
        });
    }

    private String getFormattedDate(String datetime) {
        // Assurez-vous que datetime est au format "dd/MM/yyyy à HH:mm"
        return datetime.split(" à ")[0];
    }

    private String getFormattedTime(String datetime) {
        // Assurez-vous que datetime est au format "dd/MM/yyyy à HH:mm"
        return datetime.split(" à ")[1];
    }

    private ProjectForm getProjectForm(String projectName, String typology) {
        List<Rubric> rubrics = new ArrayList<>();

        switch (typology) {
            case "normal":
                rubrics.add(createRubric("Rubric Normal 1",
                        new Question("Question 1", "radio", Arrays.asList("Rep A", "Rep B", "Rep C")),
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                rubrics.add(createRubric("Rubric Normal 2",
                        new Question("Question 3", "radio", Arrays.asList("Rep A", "Rep B")),
                        new Question("Question 4", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C"))
                ));
                break;

            case "special":
                rubrics.add(createRubric("Rubric Special 1",
                        new Question("Question 1", "radio", Arrays.asList("Rep A", "Rep B")),
                        new Question("Question 2", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C", "Rep D"))
                ));
                rubrics.add(createRubric("Rubric Special 2",
                        new Question("Question 3", "radio", Arrays.asList("Rep A", "Rep B")),
                        new Question("Question 4", "checkbox", Arrays.asList("Rep A", "Rep B", "Rep C", "Rep D"))
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
