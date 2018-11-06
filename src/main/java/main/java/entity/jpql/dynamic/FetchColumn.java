package main.java.entity.jpql.dynamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FetchColumn {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_dynamic");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Query query = entityManager.createQuery("select s.name from StudentEntity2 s");
    List<String> list = query.getResultList();
    list.forEach(s -> System.out.println(s));

    entityManager.close();
    entityManagerFactory.close();
  }
}
