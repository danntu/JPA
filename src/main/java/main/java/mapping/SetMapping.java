package main.java.mapping;

import main.java.entity.AddressSet;
import main.java.entity.EmployeeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SetMapping {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("Collection_Set");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    AddressSet a1=new AddressSet();
    a1.setE_pin_code(201301);
    a1.setE_city("Noida");
    a1.setE_state("Uttar Pradesh");

    AddressSet a2=new AddressSet();
    a2.setE_pin_code(302001);
    a2.setE_city("Jaipur");
    a2.setE_state("Rajasthan");

    AddressSet a3=new AddressSet();
    a3.setE_pin_code(133301);
    a3.setE_city("Chandigarh");
    a3.setE_state("Punjab");

    AddressSet a4=new AddressSet();
    a4.setE_pin_code(133301);
    a4.setE_city("Chandigarh");
    a4.setE_state("Punjab");

    EmployeeSet e1=new EmployeeSet();
    e1.setE_id(1);
    e1.setE_name("Vijay");

    EmployeeSet e2=new EmployeeSet();
    e2.setE_id(2);
    e2.setE_name("Vijay");

    EmployeeSet e3=new EmployeeSet();
    e3.setE_id(3);
    e3.setE_name("William");

    EmployeeSet e4=new EmployeeSet();
    e4.setE_id(4);
    e4.setE_name("Rahul");

    e1.getAddressSets().add(a1);
    e2.getAddressSets().add(a2);
    e3.getAddressSets().add(a3);
    e4.getAddressSets().add(a4);

    entityManager.persist(e1);
    entityManager.persist(e2);
    entityManager.persist(e3);
    entityManager.persist(e4);

    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}
