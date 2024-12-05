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
@Table(name="onlineorder") 
@AttributeOverrides({ 
 @AttributeOverride(name="orderid", column=@Column(name="orderid")), 
 @AttributeOverride(name="customerid", column=@Column(name="customerid")),
 @AttributeOverride(name="orderdate", column=@Column(name="orderdate")),
 @AttributeOverride(name="totalamount", column=@Column(name="totalamount")), 
 @AttributeOverride(name="paymenttype", column=@Column(name="paymenttype")), 
 @AttributeOverride(name="name", column=@Column(name="name")) ,
})
 
 @Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class OnLineOrder extends Order {
	 private String shippingaddress ;
	 private int trackingnumber ;
	 private String deliverydate ;
	 

}
