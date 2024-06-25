package com.hiago.bootcamp.domain;

public class Curso {
  private String title;
  private String description;
  private int workload;

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public int getWorkload() {
    return workload;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setWorkload(int workload) {
    this.workload = workload;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", workload=" + workload +
            '}';
  }
}
