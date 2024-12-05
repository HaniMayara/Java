package domaine;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="regular_employee")
@PrimaryKeyJoinColumn(name="idregular")
public class Regular_Employee extends Employee {
    private float salary;  
    private int bonus;  

}
