package org.odk.collect.android.activities.viewmodels;

public class Project {


        private String name;
        private String location;
        private String date;

        public Project(String name, String location, String date) {
            this.name = name;
            this.location = location;
            this.date = date;
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
    }

