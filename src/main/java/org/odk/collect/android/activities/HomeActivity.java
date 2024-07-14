package org.odk.collect.android.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.Project;
import org.odk.collect.android.adapters.ProjectAdapter;
import org.odk.collect.android.formentry.SwipeHandler;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {

    private RecyclerView recyclerViewProjects;
    private ProjectAdapter projectAdapter;
    private List<Project> projectList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupToolbar();

        // Configurer le RecyclerView
        recyclerViewProjects = findViewById(R.id.recyclerViewProjects);
        recyclerViewProjects.setLayoutManager(new LinearLayoutManager(this));

        projectList = getStaticProjects();
        removeSavedProjectsFromList();
        projectAdapter = new ProjectAdapter(projectList);
        recyclerViewProjects.setAdapter(projectAdapter);

        projectAdapter.setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = recyclerViewProjects.getChildAdapterPosition(view);
                Project clickedProject = projectList.get(position);
                Intent intent = new Intent(HomeActivity.this, DetailActivity.class);
                intent.putExtra("projectName", clickedProject.getName());
                intent.putExtra("projectLocation", clickedProject.getLocation());
                intent.putExtra("projectDate", clickedProject.getDate());
                intent.putExtra("projectTypology", clickedProject.getTypology()); // Passer la typologie
                startActivity(intent);
            }
        });
    }

    private void removeSavedProjectsFromList() {
        SharedPreferences prefs = getSharedPreferences("saved_projects", MODE_PRIVATE);
        for (int i = projectList.size() - 1; i >= 0; i--) {
            Project project = projectList.get(i);
            if (prefs.contains(project.getName())) {
                projectList.remove(i);
            }
        }
    }

    private List<Project> getStaticProjects() {
        List<Project> projects = new ArrayList<>();
            projects.add(new Project("Nom projet 6", "Casablanca", "04/05/2024 à 20:00", "normal"));
            projects.add(new Project("Nom projet 7", "Rabat", "05/05/2024 à 16:00", "special"));
            projects.add(new Project("Nom projet 8", "Sale", "05/05/2024 à 18:00", "normal"));
            projects.add(new Project("Nom projet 9", "Tanger", "06/05/2024 à 20:00", "special"));
            return projects;
        }

}
