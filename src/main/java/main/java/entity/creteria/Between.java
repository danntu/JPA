package main.java.entity.creteria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Between {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("creteria_test");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

    AbstractQuery<StudentEntity2> abstractQuery = criteriaBuilder.createQuery(StudentEntity2.class);

    Root<StudentEntity2> studentEntity2Root = abstractQuery.from(StudentEntity2.class);

    //abstractQuery.where(criteriaBuilder.between(studentEntity2Root.get("age"), 20, 27));
    //abstractQuery.where(criteriaBuilder.like(studentEntity2Root.get("name"), "D%"));
    abstractQuery.where(criteriaBuilder.in(studentEntity2Root.get("age")).value(18).value(23));
    CriteriaQuery<StudentEntity2> select = ((CriteriaQuery<StudentEntity2>) abstractQuery).select(studentEntity2Root);
    TypedQuery<StudentEntity2> typedQuery = entityManager.createQuery(select);
    List<StudentEntity2> list = typedQuery.getResultList();

    System.out.println("Students having age between 20 and 27");

    System.out.print("s_id");
    System.out.print("\t s_name");
    System.out.println("\t s_age");

    list.forEach(studentEntity2 -> {
      System.out.print(studentEntity2.getId());
      System.out.print("\t" + studentEntity2.getName());
      System.out.println("\t" + studentEntity2.getAge());
    });

  }
}
