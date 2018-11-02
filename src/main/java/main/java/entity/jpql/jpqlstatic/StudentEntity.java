package main.java.entity.jpql.jpqlstatic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NamedQuery(name = "find name", query = "select s from StudentEntity s")
@Setter
@Getter
public class StudentEntity {
  @Id
  private int id;
  private String name;
  private int age;

  public StudentEntity(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public StudentEntity() {
  }
}
