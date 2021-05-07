package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Gowtham C on 08/05/21.
 */
public class BaseEntity implements Serializable {

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
