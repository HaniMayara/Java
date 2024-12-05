package domaine;
import lombok.*;
import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee { 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
}