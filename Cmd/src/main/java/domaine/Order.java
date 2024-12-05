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
@Table(name = "order")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data @AllArgsConstructor @NoArgsConstructor

public class Order {
	private int orderid;
	private int customerid;
	 private  String orderdate  ;
	 private float totalamount ;
	 private String paymenttype ;

}
