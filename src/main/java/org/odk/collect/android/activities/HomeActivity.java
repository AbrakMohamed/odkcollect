package org.odk.collect.android.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.Project;
import org.odk.collect.android.adapters.ProjectAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerViewProjects;
    private ProjectAdapter projectAdapter;
    private List<Project> projectList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Configurer le Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                startActivity(intent);
            }
        });

        // Configurer le menu popup pour l'icône de profil
        ImageView profileIcon = findViewById(R.id.profile_icon);
        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProfileMenu(view);
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

    private void showProfileMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.profile_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();

                if (itemId == R.id.view_profile) {
                    // Logique pour afficher le profil
                    Intent profileIntent = new Intent(HomeActivity.this, ProfileActivity.class);
                    startActivity(profileIntent);
                    return true;
                } else if (itemId == R.id.change_password) {
                    // Logique pour changer le mot de passe
                    Intent changePasswordIntent = new Intent(HomeActivity.this, ChangePasswordActivity.class);
                    startActivity(changePasswordIntent);
                    return true;
                } else if (itemId == R.id.logout) {
                    // Logique pour déconnexion
                    logout();
                    return true;
                } else if (itemId == R.id.saved_projects) {
                    // Logique pour redirection vers SavedProjectsActivity
                    Intent savedProjectsIntent = new Intent(HomeActivity.this, SavedProjectsActivity.class);
                    startActivity(savedProjectsIntent);
                    return true;
                } else {
                    return false;
                }
            }

            private void logout() {
                // Logique pour la déconnexion, par exemple, effacer les préférences partagées, retourner à l'écran de connexion, etc.
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        popupMenu.show();
    }


    private List<Project> getStaticProjects() {
        // Initialiser une liste de projets avec des données statiques
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Nom projet 1", "Localisation 1", "06/05/2024 à 16:30"));
        projects.add(new Project("Nom projet 2", "Localisation 2", "07/05/2024 à 17:00"));
        projects.add(new Project("Nom projet 3", "Localisation 3", "08/05/2024 à 18:00"));
        // Ajouter autant de projets que nécessaire
        return projects;
    }
}
