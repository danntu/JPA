package main.java.entity.creteria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@SuppressWarnings("all")
public class MultipleFetch {

  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("creteria_test");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    CriteriaQuery<StudentEntity2> criteriaQuery =
            criteriaBuilder.createQuery(StudentEntity2.class);
    Root<StudentEntity2> studentEntity2Root =
            criteriaQuery.from(StudentEntity2.class);

    criteriaQuery.multiselect(studentEntity2Root.get("id"),
            studentEntity2Root.get("name"),
            studentEntity2Root.get("age"));


    CriteriaQuery<StudentEntity2> select = criteriaQuery.select(studentEntity2Root);
    TypedQuery<StudentEntity2> q = entityManager.createQuery(select);
    List<StudentEntity2> list = q.getResultList();


    list.forEach(studentEntity2 -> {
      System.out.println(studentEntity2.getId());
      System.out.println(studentEntity2.getName());
      System.out.println(studentEntity2.getAge());
    });

  }
}
