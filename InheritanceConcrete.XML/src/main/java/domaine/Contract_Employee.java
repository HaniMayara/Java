package domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@Table(name="contract_employee")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Contract_Employee extends Employee {

	 private float pay_per_hour;  
	 private String contract_duration;  
}
