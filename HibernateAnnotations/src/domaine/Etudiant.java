package domaine;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Etudiant")
@Getter @Setter @NoArgsConstructor
public class Etudiant {
	@Id
	@Column(name="id")
	int id;	
	@Column(name="nom")
	String nom;	
}
