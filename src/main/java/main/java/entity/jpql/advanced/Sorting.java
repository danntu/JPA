package main.java.entity.jpql.advanced;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Sorting {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_advanced");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Query query = entityManager.createQuery("" +
            "select s from StudentEntity1 s order by s.age desc");
    List<StudentEntity1> list1 = (List<StudentEntity1>) query.getResultList();

    System.out.print("s_id");
    System.out.print("\t s_name");
    System.out.println("\t s_age");
    list1.forEach(studentEntity1 -> {
      System.out.print(studentEntity1.getId());
      System.out.print("\t " + studentEntity1.getName());
      System.out.println("\t " + studentEntity1.getAge());
    });

  }
}
