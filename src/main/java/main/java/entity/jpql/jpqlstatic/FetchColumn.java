package main.java.entity.jpql.jpqlstatic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class FetchColumn {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_static");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Query query = entityManager.createNamedQuery("find name");
    List<StudentEntity> list = query.getResultList();

    list.forEach(studentEntity -> System.out.println(studentEntity.getName()));

  }
}
