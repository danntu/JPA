package main.java.entity;


import main.java.entity.Address;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int e_id;
  private String e_name;
  @ElementCollection
  private List<Address> addressList = new ArrayList<Address>();

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

  public List<Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(List<Address> addressList) {
    this.addressList = addressList;
  }
}
