
package org.odk.collect.android.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.odk.collect.android.R;
import org.odk.collect.android.adapters.SavedProjectAdapter;
import org.odk.collect.android.activities.viewmodels.SavedProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SavedProjectsActivity extends BaseActivity implements SavedProjectAdapter.OnItemClickListener {

    private RecyclerView recyclerViewSavedProjects;
    private SavedProjectAdapter savedProjectAdapter;
    private List<SavedProject> savedProjectList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_projects);

        setupToolbar();

        recyclerViewSavedProjects = findViewById(R.id.recyclerViewSavedProjects);
        recyclerViewSavedProjects.setLayoutManager(new LinearLayoutManager(this));

        // Charger la liste des projets enregistrés
        savedProjectList = loadSavedProjects();

        savedProjectAdapter = new SavedProjectAdapter(savedProjectList, this);
        recyclerViewSavedProjects.setAdapter(savedProjectAdapter);
    }

    private List<SavedProject> loadSavedProjects() {
        // Charger les projets enregistrés depuis les préférences partagées
        SharedPreferences prefs = getSharedPreferences("saved_projects", MODE_PRIVATE);
        Map<String, ?> allEntries = prefs.getAll();
        List<SavedProject> projects = new ArrayList<>();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            projects.add(new SavedProject(entry.getKey(), entry.getValue().toString()));
        }
        return projects;
    }

    @Override
    public void onItemClick(SavedProject project) {
        // Créez une intention pour démarrer ProjectDetailsActivity
        Intent intent = new Intent(this, ProjectDetailsActivity.class);
        intent.putExtra("projectName", project.getProjectName());
        // Vous pouvez ajouter d'autres informations ici si nécessaire
        startActivity(intent);
    }
}
