package main.java.entity.jpql.dynamic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Setter
@Getter
public class StudentEntity {
  @Id
  private int id;
  private String name;
  private int age;

  public StudentEntity(int id, String name, int age) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public StudentEntity() {
    super();
  }
}
