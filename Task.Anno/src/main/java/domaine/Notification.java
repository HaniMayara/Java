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
@Table(name = "notification")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 

@Data @AllArgsConstructor @NoArgsConstructor
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;  
	private String firstName;
	private String lastName;
	private String createdOn;
}

