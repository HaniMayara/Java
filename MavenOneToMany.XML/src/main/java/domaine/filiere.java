package domaine;
import java.util.Set;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class filiere {
	private Integer idF;
    private String nmF;
	private Set<Student> students;
	public Set<Student> getstudents() {return students; }
	public void setstudents(Set<Student> students) {this.students = students;}


}
