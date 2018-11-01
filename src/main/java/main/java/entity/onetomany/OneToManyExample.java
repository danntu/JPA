package main.java.entity.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class OneToManyExample {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("book_issued");

    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    Library lib1=new Library();
    lib1.setId(101);
    lib1.setName("Data Structure");


    Library lib2=new Library();
    lib2.setId(102);
    lib2.setName("DBMS");

    entityManager.persist(lib1);
    entityManager.persist(lib2);

    entityManager.persist(lib1);
    entityManager.persist(lib2);

    ArrayList<Library> list = new ArrayList<Library>();

    list.add(lib1);
    list.add(lib2);

    Student student = new Student();
    student.setId(1);
    student.setName("Danik");
    student.setBook_issued(list);

    entityManager.persist(student);

    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();

  }
}
