package main.java;

import javax.persistence.Embeddable;

@Embeddable
public class AddressSet {
  private int e_pin_code;
  private String e_city;
  private String e_state;

  public int getE_pin_code() {
    return e_pin_code;
  }

  public void setE_pin_code(int e_pin_code) {
    this.e_pin_code = e_pin_code;
  }

  public String getE_city() {
    return e_city;
  }

  public void setE_city(String e_city) {
    this.e_city = e_city;
  }

  public String getE_state() {
    return e_state;
  }

  public void setE_state(String e_state) {
    this.e_state = e_state;
  }
}
