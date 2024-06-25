package com.hiago.bootcamp.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
  private String name;
  private  String description;
  private LocalDate startDate = LocalDate.now();
  private final LocalDate finalDate = startDate.plusDays(45);
  private Set<Dev> subscribedDevs = new HashSet<>();
  private Set<Content> contents = new LinkedHashSet<>();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Bootcamp bootcamp)) return false;
    return Objects.equals(getName(), bootcamp.getName()) && Objects.equals(getDescription(), bootcamp.getDescription()) && Objects.equals(getStartDate(), bootcamp.getStartDate()) && Objects.equals(getFinalDate(), bootcamp.getFinalDate()) && Objects.equals(getSubscribedDevs(), bootcamp.getSubscribedDevs()) && Objects.equals(getContents(), bootcamp.getContents());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getDescription(), getStartDate(), getFinalDate(), getSubscribedDevs(), getContents());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getFinalDate() {
    return finalDate;
  }

  public Set<Dev> getSubscribedDevs() {
    return subscribedDevs;
  }

  public void setSubscribedDevs(Set<Dev> subscribedDevs) {
    this.subscribedDevs = subscribedDevs;
  }

  public Set<Content> getContents() {
    return contents;
  }

  public void setContents(Set<Content> contents) {
    this.contents = contents;
  }
}
