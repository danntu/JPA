package main.java.entity;


import main.java.entity.AddressSet;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class EmployeeSet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int e_id;
  private String e_name;
  @ElementCollection
  private Set<AddressSet> addressSets = new HashSet<AddressSet>();

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

  public Set<AddressSet> getAddressSets() {
    return addressSets;
  }

  public void setAddressSets(Set<AddressSet> addressSets) {
    this.addressSets = addressSets;
  }
}
