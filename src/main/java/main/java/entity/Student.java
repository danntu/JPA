package main.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String student_name;

  public Student(int studentId, String studentName) {
    super();
    this.id = studentId;
    this.student_name = studentName;
  }

  public Student() {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStudentName() {
    return student_name;
  }

  public void setStudentName(String studentName) {
    this.student_name = studentName;
  }
}
