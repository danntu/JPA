package main.java.entity.jpainheritance;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class ActiveEmployee extends Employee {
  private int salary;
  private int experience;

  public ActiveEmployee(int id, String name, int salary, int experience) {
    super(id, name);
    this.salary = salary;
    this.experience = experience;
  }

  public ActiveEmployee() {
    super();
  }
}
