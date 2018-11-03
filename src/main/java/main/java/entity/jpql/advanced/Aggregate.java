package main.java.entity.jpql.advanced;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Aggregate {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_advanced");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Query queryCount = entityManager.createQuery("" +
            "select count(s) from StudentEntity1 s");
    System.out.println("Number of student: " + queryCount.getSingleResult());

    Query queryMax = entityManager.createQuery("" +
            "select max (s.age) from StudentEntity1 s ");
    System.out.println("Maximum age: " + queryMax.getSingleResult());

    Query queryMin = entityManager.createQuery("" +
            "select min (s.age) from StudentEntity1 s ");
    System.out.println("Minimum age: " + queryMin.getSingleResult());

  }
}
