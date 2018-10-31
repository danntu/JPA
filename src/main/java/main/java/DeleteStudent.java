package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteStudent {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("StudentDetails");
    EntityManager entityManager =  entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();
    StudentEntity studentEntity = entityManager.find(StudentEntity.class, 103);
    entityManager.remove(studentEntity);
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
