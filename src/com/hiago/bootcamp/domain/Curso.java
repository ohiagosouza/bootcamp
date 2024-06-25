package com.hiago.bootcamp.domain;

public class Curso extends Content{
  private int workload;

  public Curso(String title, String description, int workload) {
    super(title, description);
    this.workload = workload;
  }

  public int getWorkload() {
    return workload;
  }

  @Override
  public double calculateXp() {
    return DEFAULT_XP * workload;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "title='" + getTitle() + '\'' +
            ", description='" + getDescription() + '\'' +
            ", workload=" + workload +
            '}';
  }

}
