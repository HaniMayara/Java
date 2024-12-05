package domaine;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

public class filiere {
	@OneToMany(mappedBy="filiereS")
	private Set<Student> students;
	public Set<Student> getstudents() {return students; }
	public void setstudents(Set<Student> students) {this.students = students;}


}
