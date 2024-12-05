package domaine;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name="student")
public class Etudiant {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idS")
    int id;
    
    @Column(name="nomS")
    String nom;
    
}