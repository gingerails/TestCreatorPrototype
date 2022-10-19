package cs499.team8.testcreatorprototype.Entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    private String UserID;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;

    public User() {

    }

    @Override
    public String toString() {
        return "User [UserID=" + UserID + ", Username =" + username + "]";
    }

}
