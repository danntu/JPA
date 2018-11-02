package main.java.entity.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class ManyToManyExample {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("many_to_many");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    Student student1 = new Student(1, "Danik", null);
    Student student2 = new Student(2, "Olzhas", null);
    entityManager.persist(student1);
    entityManager.persist(student2);

    ArrayList<Student> students1 = new ArrayList<Student>();
    ArrayList<Student> students2 = new ArrayList<Student>();

    students1.add(student1);
    students1.add(student2);

    students2.add(student1);
    students2.add(student2);


    Library library1 = new Library(101, "Data Structure", students1);
    Library library2 = new Library(102, "DBMS", students2);

    entityManager.persist(library1);
    entityManager.persist(library2);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();

  }
}
