package com.hiago.bootcamp.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
  private LocalDate date;

  public Mentoring(String title, String description, LocalDate localDate) {
    super(title, description);
    this.date = localDate;
  }

  @Override
  public double calculateXp() {
    return DEFAULT_XP + 20d;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Mentoring{" +
            "title='" + getTitle() + '\'' +
            ", description='" + getDescription() + '\'' +
            ", date=" + date +
            '}';
  }


}
