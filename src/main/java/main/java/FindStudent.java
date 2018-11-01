package main.java;

import main.java.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("StudentDetails");

    EntityManager entityManager = entityManagerFactory.createEntityManager();

    StudentEntity studentEntity = entityManager.find(StudentEntity.class,102);
    System.out.println("Student id "+studentEntity.getS_id());
    System.out.println("Student name "+studentEntity.getS_name());
    System.out.println("Student age "+studentEntity.getS_age());
  }
}
