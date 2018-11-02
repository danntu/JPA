package main.java.entity.cascade.remove;

import main.java.entity.cascade.persist.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCascade {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("cascade_remove");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    StudentEntity studentEntity = entityManager.find(StudentEntity.class, 101);
    entityManager.remove(studentEntity);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();

  }
}
