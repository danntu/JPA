package main.java.entity.jpainheritance;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class RetiredEmployee extends Employee {
  private int pension;

  public RetiredEmployee(int id, String name, int pension) {
    super(id, name);
    this.pension = pension;
  }

  public RetiredEmployee() {
  }
}
