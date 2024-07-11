package org.odk.collect.android.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.ProjectForm;
import org.odk.collect.android.activities.viewmodels.Rubric;
import org.odk.collect.android.fragments.RubricFragment;

import java.util.List;

public class FormActivity extends AppCompatActivity {

    private List<Rubric> rubrics;
    private int currentRubricIndex = 0;
    private ProjectForm projectForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // Récupérer le formulaire du projet depuis l'intent
        projectForm = (ProjectForm) getIntent().getSerializableExtra("projectForm");
        rubrics = projectForm.getRubrics();

        // Afficher la première rubrique
        showRubric(currentRubricIndex);
    }

    public void showRubric(int index) {
        if (index < 0 || index >= rubrics.size()) {
            return;
        }
        Rubric rubric = rubrics.get(index);
        RubricFragment fragment = RubricFragment.newInstance(rubric, index == rubrics.size() - 1);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    public void goToNextRubric() {
        if (currentRubricIndex < rubrics.size() - 1) {
            currentRubricIndex++;
            showRubric(currentRubricIndex);
        }
    }

    public void goToPreviousRubric() {
        if (currentRubricIndex > 0) {
            currentRubricIndex--;
            showRubric(currentRubricIndex);
        }
    }

    private boolean isFormComplete() {
        // Logique pour vérifier si toutes les rubriques/questions ont été répondues
        for (Rubric rubric : rubrics) {
            if (!rubric.isCompleted()) { // Assurez-vous que Rubric a une méthode isCompleted
                return false;
            }
        }
        return true;
    }

    public void validateForm() {
        boolean isComplete = isFormComplete();

        // Enregistrer les réponses du formulaire ici avec l'état approprié
        saveProject(isComplete);

        // Retourner à HomeActivity
        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void saveProject(boolean isComplete) {
        // Sauvegarder le projet avec ses réponses
        // Vous pouvez utiliser une base de données locale, un fichier, ou une autre méthode de stockage

        // Exemple simple de sauvegarde dans les préférences partagées
        SharedPreferences prefs = getSharedPreferences("saved_projects", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        String status = isComplete ? "validé" : "non validé";
        editor.putString(projectForm.getProjectName(), status);
        editor.apply();
    }
}
