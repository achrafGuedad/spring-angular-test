package lu.atozdigital.api.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import lu.atozdigital.api.models.AppRole;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeUSer")
public abstract class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Collection<AppRole> getRoles() {
        return roles;
    }

    public String getEmail() {
        return email;
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String firstName;
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<AppRole> roles = new ArrayList<>();
    private String email;

}