package payroll;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Employee {

    @Getter @Setter
    private @Id @GeneratedValue Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}

