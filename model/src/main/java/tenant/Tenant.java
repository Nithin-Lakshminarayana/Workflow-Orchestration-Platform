package tenant;

import java.util.Date;
import java.util.UUID;

public class Tenant {

  private UUID id;
  private String name;
  private Date createdAt;

  public Tenant(UUID id, String name, Date createdAt) {
    this.id = id;
    this.name = name;
    this.createdAt = createdAt;
  }

  public Tenant() {
    //Default Constructor
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}
