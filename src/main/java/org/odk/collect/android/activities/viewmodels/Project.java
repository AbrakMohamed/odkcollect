// Project.java
package org.odk.collect.android.activities.viewmodels;

import java.io.Serializable;

public class Project implements Serializable {
    private String name;
    private String location;
    private String date;
    private String typology; // Ajout de ce champ

    public Project(String name, String location, String date, String typology) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.typology = typology;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTypology() {
        return typology;
    }
}
