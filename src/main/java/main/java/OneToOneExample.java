package main.java;

import main.java.entity.Library;
import main.java.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneExample {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("Book_Issued");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    Student student1 = new Student();
    student1.setStudentName("Daniyar");
    Student student2 = new Student();
    student2.setStudentName("Dauren");

    entityManager.persist(student1);
    entityManager.persist(student2);

    Library library1 = new Library();
    library1.setBook_name("Data structure");
    library1.setStudent(student1);

    Library library2 = new Library();
    library2.setBook_name("DBMS");
    library2.setStudent(student2);

    entityManager.persist(library1);
    entityManager.persist(library2);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();

  }
}
