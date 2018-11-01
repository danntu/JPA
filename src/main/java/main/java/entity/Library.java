package main.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Library {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String book_name;

  @OneToOne
  private Student student;

  public Library() {
    super();
  }

  public Library(int bookId, String bookName, Student student) {
    super();
    this.id = bookId;
    this.book_name = bookName;
    this.student = student;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBook_name() {
    return book_name;
  }

  public void setBook_name(String book_name) {
    this.book_name = book_name;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}
