package domaine;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="contract_employee")
@PrimaryKeyJoinColumn(name="idcontract")
public class Contract_Employee extends Employee {
    private float pay_per_hour;  
    private String contract_duration;  
}

