package br.com.alura.challenges.model;

public class Task {
    private String description;
    private boolean concluded;
    private String responsiblePerson;

    public Task() {}

    public Task(String description, boolean concluded, String responsiblePerson) {
        this.description = description;
        this.concluded = concluded;
        this.responsiblePerson = responsiblePerson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + this.description + '\'' +
                ", concluded=" + this.concluded +
                ", responsiblePerson='" + this.responsiblePerson + '\'' +
                '}';
    }
}
