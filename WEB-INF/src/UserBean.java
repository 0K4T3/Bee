package Bee;

import java.io.Serializable;

public class UserBean implements Serializable {
  private int id;
  private String name;
  private int age;
  private String email;
  private String password;
  private String location;

  // initializer
  public UserBean() {
    this.id = 0;
    this.name = null;
    this.age = 0;
    this.email = null;
    this.password = null;
    this.location = null;
  }

  // getter
  public int getId() { return this.id; }
  public String getName() { return this.name; }
  public int getAge() { return this.age; }
  public String getEmail() { return this.email; }
  public String getPassword() { return this.password; }
  public String getLocation() { return this.location; }

  // setter
  public void setId(int id) { this.id = id; }
  public void setName(String name) { this.name = name; }
  public void setAge(int age) { this.age = age; }
  public void setEmail(String name) { this.email = email; }
  public void setPassword(String password) { this.password = password; }
  public void setLocation(String location) { this.location = location; }
}
