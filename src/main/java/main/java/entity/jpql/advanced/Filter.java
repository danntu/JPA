package main.java.entity.jpql.advanced;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Filter {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_advanced");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    Query queryBetween = entityManager.createQuery(
            "select s from StudentEntity1 s where " +
                    "s.age between 18 and 30"
    );
    List<StudentEntity1> list1 = (List<StudentEntity1>) queryBetween.getResultList();

    System.out.println("Between Clause");
    System.out.print("s_id");
    System.out.print("\t s_name");
    System.out.println("\t s_age");

    list1.forEach(studentEntity1 -> {
      System.out.print(studentEntity1.getId());
      System.out.print("\t " + studentEntity1.getName());
      System.out.println("\t " + studentEntity1.getAge());
    });

    Query queryIn = entityManager.createQuery(
            "select s from StudentEntity1 s where s.age IN(18,23)"
    );

    List<StudentEntity1> list2 = (List<StudentEntity1>) queryIn.getResultList();
    System.out.println("IN Clause");
    System.out.print("s_id");
    System.out.print("\t s_name");
    System.out.println("\t s_age");

    list2.forEach(studentEntity2 -> {
      System.out.print(studentEntity2.getId());
      System.out.print("\t " + studentEntity2.getName());
      System.out.println("\t " + studentEntity2.getAge());
    });

    Query queryLike = entityManager.createQuery(
            "select s from StudentEntity1 s where s.name like '%a%' "
    );
    List<StudentEntity1> list3 = (List<StudentEntity1>) queryLike.getResultList();
    System.out.println("Like Clause");
    System.out.print("s_id");
    System.out.print("\t s_name");
    System.out.println("\t s_age");

    list3.forEach(studentEntity3 -> {
      System.out.print(studentEntity3.getId());
      System.out.print("\t " + studentEntity3.getName());
      System.out.println("\t " + studentEntity3.getAge());
    });

  }
}
