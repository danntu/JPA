package main.java.entity.jpainheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeePersistence {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("employee_details");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    ActiveEmployee activeEmployee1 =
            new ActiveEmployee(101, "Karun", 10000, 5);
    ActiveEmployee activeEmployee2 =
            new ActiveEmployee(102, "Rishab", 12000, 7);

    RetiredEmployee retiredEmployee1 =
            new RetiredEmployee(103, "Ramesh", 5000);
    RetiredEmployee retiredEmployee2 =
            new RetiredEmployee(104, "Raj", 4000);

    entityManager.persist(activeEmployee1);
    entityManager.persist(activeEmployee2);
    entityManager.persist(retiredEmployee1);
    entityManager.persist(retiredEmployee2);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
