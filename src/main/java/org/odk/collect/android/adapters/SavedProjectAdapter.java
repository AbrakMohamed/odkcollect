package org.odk.collect.android.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.SavedProject;

import java.util.List;

public class SavedProjectAdapter extends RecyclerView.Adapter<SavedProjectAdapter.ViewHolder> {

    private List<SavedProject> savedProjectList;

    public SavedProjectAdapter(List<SavedProject> savedProjectList) {
        this.savedProjectList = savedProjectList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_saved_project, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SavedProject savedProject = savedProjectList.get(position);
        holder.textViewProjectName.setText(savedProject.getProjectName());
        holder.textViewProjectStatus.setText(savedProject.getProjectStatus());
    }

    @Override
    public int getItemCount() {
        return savedProjectList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewProjectName;
        TextView textViewProjectStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewProjectName = itemView.findViewById(R.id.textViewProjectName);
            textViewProjectStatus = itemView.findViewById(R.id.textViewProjectStatus);
        }
    }
}
