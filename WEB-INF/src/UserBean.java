package Bee;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String id;
    private String name;
    private String age;
    private String email;
    private String password;
    private String location;
    private String sex;

    // initializer
    public UserBean() {
        this.id = null;
        this.name = null;
        this.age = null;
        this.email = null;
        this.password = null;
        this.location = null;
        this.sex = null;
    }

    // getter
    public String getId() { return this.id; }
    public String getName() { return this.name; }
    public String getAge() { return this.age; }
    public String getEmail() { return this.email; }
    public String getPassword() { return this.password; }
    public String getLocation() { return this.location; }
    public String getSex() { return this.sex; }

    // setter
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(String age) { this.age = age; }
    public void setEmail(String name) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setLocation(String location) { this.location = location; }
    public void setSex(String sex) { this.sex = sex; }
}
