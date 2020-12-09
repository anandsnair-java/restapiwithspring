package payroll.employee;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Employee {

    @Getter @Setter
    private @Id @GeneratedValue Long id;
    //    @Getter @Setter
//    private String name;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String role;

//    public Employee(String name, String role) {
//        this.name = name;
//        this.role = role;
//    }

    public Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}

