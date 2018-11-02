package main.java.entity.jpql.bulk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FetchData {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_bulk");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Query query = entityManager.createQuery("select s from StudentEntity s");
    List<StudentEntity> list = (List<StudentEntity>) query.getResultList();

    list.forEach(studentEntity -> System.out.println(
            studentEntity.getId()
                    + " " + studentEntity.getName()
                    + " " + studentEntity.getAge()
    ));

    Query queryUpdate = entityManager.createQuery(
            "update StudentEntity set age = 25 where id>103");
    queryUpdate.executeUpdate();

    Query queryDelete = entityManager.createQuery(
            "delete from StudentEntity where id = 102"
    );
    queryDelete.executeUpdate();

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
