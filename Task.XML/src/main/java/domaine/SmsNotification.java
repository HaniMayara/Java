package domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@Table(name="smsnotification")  
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class SmsNotification extends Notification {
    
    @Column(name="phoneNumber")
    private String phoneNumber;
}
