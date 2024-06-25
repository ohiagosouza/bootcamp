package com.hiago.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String name;
  private Set<Content> subedContent = new LinkedHashSet<>();
  private Set<Content> doneContent = new LinkedHashSet<>();

  public void subscribeToBootcamp(Bootcamp bootcamp){
    this.subedContent.addAll(bootcamp.getContents());
    bootcamp.getSubscribedDevs().add(this);
  };

  public void progress(){
    Optional<Content> content = this.subedContent.stream().findFirst();
    if(content.isPresent()){
      this.doneContent.add(content.get());
      this.subedContent.remove(content.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo");
    }
  };

  public double calcTotalXp(){
    return this.doneContent
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
  }

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
