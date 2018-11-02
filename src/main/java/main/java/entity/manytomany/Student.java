package main.java.entity.manytomany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Setter
@Getter
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;

  @ManyToMany(targetEntity = Library.class)
  private List lib;

  public Student(int id, String name, List lib) {
    super();
    this.id = id;
    this.name = name;
    this.lib = lib;
  }

  public Student() {
    super();
  }
}
