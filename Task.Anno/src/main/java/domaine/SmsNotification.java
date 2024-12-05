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
@Table(name="smsnotification")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),
    @AttributeOverride(name="firstName", column=@Column(name="firstName")),
    @AttributeOverride(name="lastName", column=@Column(name="lastName")),
    @AttributeOverride(name="createdOn", column=@Column(name="createdOn"))  
})  
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class SmsNotification extends Notification {

	 private String phoneNumber;
}
