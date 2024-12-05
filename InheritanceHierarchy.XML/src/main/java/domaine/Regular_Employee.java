package domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@DiscriminatorValue("reg_emp")
public class Regular_Employee extends Employee {
    private float salary;  
    private int bonus;  

}
