package main.java.entity.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneExample {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("many_to_one");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    Library lib = new Library();
    lib.setId(101);
    lib.setName("Data Structure");

    entityManager.persist(lib);

    Student student1 = new Student();
    student1.setId(1);
    student1.setName("Danik");
    student1.setLibrary(lib);

    entityManager.persist(student1);

    Student student2 = new Student();
    student2.setId(2);
    student2.setName("Olzhas");
    student2.setLibrary(lib);
    entityManager.persist(student2);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
