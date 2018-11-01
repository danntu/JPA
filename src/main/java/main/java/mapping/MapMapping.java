package main.java.mapping;

import main.java.entity.AddressMap;
import main.java.entity.EmployeeMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MapMapping {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("Collection_Map");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();

    AddressMap a1=new AddressMap();
    a1.setE_pincode(201301);
    a1.setE_city("Noida");
    a1.setE_state("Uttar Pradesh");

    AddressMap a2=new AddressMap();
    a2.setE_pincode(302001);
    a2.setE_city("Jaipur");
    a2.setE_state("Rajasthan");

    AddressMap a3=new AddressMap();
    a3.setE_pincode(133301);
    a3.setE_city("Chandigarh");
    a3.setE_state("Punjab");

    AddressMap a4=new AddressMap();
    a4.setE_pincode(80001);
    a4.setE_city("Patna");
    a4.setE_state("Bihar");

    EmployeeMap e1=new EmployeeMap();
    e1.setE_id(1);
    e1.setE_name("Vijay");

    EmployeeMap e2=new EmployeeMap();
    e2.setE_id(2);
    e2.setE_name("Vijay");

    EmployeeMap e3=new EmployeeMap();
    e3.setE_id(3);
    e3.setE_name("William");

    EmployeeMap e4=new EmployeeMap();
    e4.setE_id(4);
    e4.setE_name("Rahul");

    e1.getMap().put(1,a1);
    e2.getMap().put(2,a2);
    e3.getMap().put(3,a3);
    e4.getMap().put(4,a4);


    entityManager.persist(e1);
    entityManager.persist(e2);
    entityManager.persist(e3);
    entityManager.persist(e4);


    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();

  }
}
