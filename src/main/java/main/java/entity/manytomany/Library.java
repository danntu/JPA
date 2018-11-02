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
public class Library {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;

  @ManyToMany(targetEntity = Student.class)
  private List student;

  public Library(int id, String name, List student) {
    super();
    this.id = id;
    this.name = name;
    this.student = student;
  }

  public Library() {
    super();
  }


}
