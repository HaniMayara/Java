package domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@Table(name="emailnotification")  
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class EmailNotification extends Notification {
    
    @Column(name="emailAddress")
    private String emailAddress;
}
