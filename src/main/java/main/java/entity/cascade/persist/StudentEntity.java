package main.java.entity.cascade.persist;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

  @OneToOne(cascade = CascadeType.PERSIST)
  private Subject subject;

  public StudentEntity(int id, String name, int age, Subject subject) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.subject = subject;
  }

  public StudentEntity() {
    super();
  }
}
