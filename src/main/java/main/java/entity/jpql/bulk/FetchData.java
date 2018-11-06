package main.java.entity.jpql.bulk;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchData {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpql_bulk");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    Query query = entityManager.createQuery("select s from StudentEntity2 s");
    List<StudentEntity> list = (List<StudentEntity>) query.getResultList();

    list.forEach(studentEntity -> System.out.println(
            studentEntity.getId()
                    + " " + studentEntity.getName()
                    + " " + studentEntity.getAge()
    ));

    Query queryUpdate = entityManager.createQuery(
            "update StudentEntity2 set age = 25 where id>103");
    queryUpdate.executeUpdate();

    Query queryDelete = entityManager.createQuery(
            "delete from StudentEntity2 where id = 102"
    );
    queryDelete.executeUpdate();

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
