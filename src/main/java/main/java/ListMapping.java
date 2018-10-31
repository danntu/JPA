package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListMapping {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("Collection_Type");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();
    Address a1=new Address();
    a1.setE_pin_code(201301);
    a1.setE_city("Almaty");
    a1.setE_state("Almaty oblast");

    Address a2=new Address();
    a2.setE_pin_code(302001);
    a2.setE_city("Astana");
    a2.setE_state("Akmola oblast");

    Employee e1=new Employee();
    e1.setE_id(1);
    e1.setE_name("Daniyar");
    e1.getAddressList().add(a1);

    Employee e2=new Employee();
    e2.setE_id(2);
    e2.setE_name("Dauren");
    e2.getAddressList().add(a2);

    entityManager.persist(e1);
    entityManager.persist(e2);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
