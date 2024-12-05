package domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity  
@Table(name="regular_employee")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
}) 
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Regular_Employee extends Employee {

	private float salary;  
	private int bonus;  
}
