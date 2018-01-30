package contact.classes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Contact {
    @GeneratedValue
    @javax.persistence.Id
    private Long Id;
    private String firstName;
    private String lastName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

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
