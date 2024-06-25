import com.hiago.bootcamp.domain.Curso;
import com.hiago.bootcamp.domain.Mentoring;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Main {
  public static void main(String[] args) {
    Curso cursoJava = new Curso();
    cursoJava.setTitle("Curso Java");
    cursoJava.setDescription("Descrição Curso Java");
    cursoJava.setWorkload(65);

    Mentoring carrerMentoring = new Mentoring();
    carrerMentoring.setTitle("Mentoring about Carrer");
    carrerMentoring.setDescription("Description about the mentoring");
    carrerMentoring.setDate(LocalDate.now());

    System.out.println(cursoJava);
    System.out.println(carrerMentoring);
  }
}
