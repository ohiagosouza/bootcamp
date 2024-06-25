import com.hiago.bootcamp.domain.Content;
import com.hiago.bootcamp.domain.Curso;
import com.hiago.bootcamp.domain.Mentoring;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Main {
  public static void main(String[] args) {
    Content cursoJava = new Curso("Curso Java", "Descrição Curso Java", 65);
    Content carrerMentoring = new Mentoring("Mentoring about Carrer", "Description about the mentoring", LocalDate.parse("2024-08-20"));

    System.out.println(cursoJava);
    System.out.println(carrerMentoring);
  }
}
