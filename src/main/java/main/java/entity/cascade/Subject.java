package main.java.entity.cascade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@Setter
@Getter
public class Subject {
  private String name;
  private int marks;
  @Id
  private int id;

  public Subject() {
    super();
  }
}
