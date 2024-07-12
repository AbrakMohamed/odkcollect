package org.odk.collect.android.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.viewmodels.Project;
import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private List<Project> projectList;
    private View.OnClickListener onItemClickListener;

    public ProjectAdapter(List<Project> projectList) {
        this.projectList = projectList;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        Project project = projectList.get(position);
        holder.textViewName.setText(project.getName());
        holder.textViewLocation.setText(project.getLocation());
        holder.textViewDate.setText(project.getDate());
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    public void setOnItemClickListener(View.OnClickListener clickListener) {
        onItemClickListener = clickListener;
    }

    public class ProjectViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewLocation, textViewDate;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewLocation = itemView.findViewById(R.id.textViewLocation);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            itemView.setTag(this);
            itemView.setOnClickListener(onItemClickListener);
        }
    }
}
