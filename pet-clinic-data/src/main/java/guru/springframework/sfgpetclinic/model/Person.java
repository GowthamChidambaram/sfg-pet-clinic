package guru.springframework.sfgpetclinic.model;

/**
 * Created by Gowtham C on 07/05/21.
 */
public class Person extends BaseEntity {

  private String firstName;

  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
