package main.java.entity.creteria;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Setter
@Getter
public class StudentEntity2 {
  @Id
  private int id;
  private String name;
  private int age;

  public StudentEntity2(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public StudentEntity2() {
  }
}
