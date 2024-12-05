package domaine;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name="filiere")
public class filiere {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idF")
    int id;
    
    @Column(name="nmF")
    String nom;
    
}