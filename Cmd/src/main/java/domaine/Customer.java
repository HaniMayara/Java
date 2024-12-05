package domaine;
import javax.persistence.*;
import lombok.*;
@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "customer")

public class Customer {
	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	 private Set<Order> orders;
	
}
