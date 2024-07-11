package org.odk.collect.android.activities.viewmodels;

import java.io.Serializable;

public class SavedProject implements Serializable {
    private String projectName;
    private String projectStatus;

    public SavedProject(String projectName, String projectStatus) {
        this.projectName = projectName;
        this.projectStatus = projectStatus;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectStatus() {
        return projectStatus;
    }
}
