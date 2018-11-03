package main.java.entity.jpql.advanced;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "student")
public class StudentEntity1 {
  @Id
  private int id;
  private String name;
  private int age;

  public StudentEntity1(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public StudentEntity1() {
  }
}
