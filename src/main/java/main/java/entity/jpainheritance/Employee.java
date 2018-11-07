package main.java.entity.jpainheritance;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Setter
@Getter
public class Employee {
  @Id
  private int id;
  private String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Employee() {
  }
}
