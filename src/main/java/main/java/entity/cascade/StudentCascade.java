package main.java.entity.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCascade {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("cascade_persist");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    StudentEntity entity1 = new StudentEntity();
    entity1.setId(101);
    entity1.setName("Danik");
    entity1.setAge(32);

    StudentEntity entity2 = new StudentEntity();
    entity2.setId(102);
    entity2.setName("Olzhas");
    entity2.setAge(31);

    Subject subject1 = new Subject();
    subject1.setName("English");
    subject1.setMarks(80);
    subject1.setId(entity1.getId());

    Subject subject2 = new Subject();
    subject2.setName("Math");
    subject2.setMarks(75);
    subject2.setId(entity2.getId());

    entity1.setSubject(subject1);
    entity2.setSubject(subject2);

    entityManager.persist(entity1);
    entityManager.persist(entity2);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();

  }
}
