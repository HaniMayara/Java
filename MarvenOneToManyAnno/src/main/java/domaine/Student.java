package domaine;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

public class Student {
	@ManyToOne
	@JoinColumn(name="filS")
	private filiere filiereS;
	public filiere getFilS(){return filiereS;}
	public void setfiliereS(filiere filiereS){this.filiereS = filiereS;}

}
