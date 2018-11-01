package main.java;

import main.java.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistStudent {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("StudentDetails");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    StudentEntity s1 = new StudentEntity();
    s1.setS_id(101);
    s1.setS_name("Daniyar");
    s1.setS_age(32);

    StudentEntity s2 = new StudentEntity();
    s2.setS_id(102);
    s2.setS_name("Dauren");
    s2.setS_age(22);

    StudentEntity s3 = new StudentEntity();
    s3.setS_id(103);
    s3.setS_name("Olzhas");
    s3.setS_age(26);

    entityManager.persist(s1);
    entityManager.persist(s2);
    entityManager.persist(s3);

    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();

  }
}
