package com.hiago.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
  private String name;
  private Set<Content> subedContent = new LinkedHashSet<>();
  private Set<Content> doneContent = new LinkedHashSet<>();

  public void subscribeToBootcamp(Bootcamp bootcamp){};
  public void progress(){};
  public void calcTotalXp(){}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Dev dev)) return false;
    return Objects.equals(getName(), dev.getName()) && Objects.equals(getSubedContent(), dev.getSubedContent()) && Objects.equals(getDoneContent(), dev.getDoneContent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getSubedContent(), getDoneContent());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getSubedContent() {
    return subedContent;
  }

  public void setSubedContent(Set<Content> subedContent) {
    this.subedContent = subedContent;
  }

  public Set<Content> getDoneContent() {
    return doneContent;
  }

  public void setDoneContent(Set<Content> doneContent) {
    this.doneContent = doneContent;
  }
}
