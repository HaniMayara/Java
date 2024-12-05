package domaine;
import java.util.Set;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Student {
	private Integer idS;
    private String nomS;
	private filiere filiereS;
	public filiere getFilS(){return filiereS;}
	public void setfiliereS(filiere filiereS){this.filiereS = filiereS;}

}
