package main.java.entity;

import main.java.entity.AddressMap;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

@Entity
public class EmployeeMap {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int e_id;
  private String e_name;

  @ElementCollection
  private Map<Integer, AddressMap> map =
          new HashMap<Integer, AddressMap>();

  public int getE_id() {
    return e_id;
  }

  public void setE_id(int e_id) {
    this.e_id = e_id;
  }

  public String getE_name() {
    return e_name;
  }

  public void setE_name(String e_name) {
    this.e_name = e_name;
  }

  public Map<Integer, AddressMap> getMap() {
    return map;
  }

  public void setMap(Map<Integer, AddressMap> map) {
    this.map = map;
  }
}
