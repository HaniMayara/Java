package domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  
@Table(name = "employee")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;  
	private String name;  
}

